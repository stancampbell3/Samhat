package net.explorys.samhat

import org.pb.x12.{Loop, X12}
import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

/**
 * Created by stan.campbell on 8/24/15.
 */
class X12toAvroUtilSpec extends FlatSpec with Matchers {

  import X12_FORMAT._

  val parser = new X12toAvroUtil
  
  // Collections of example transactions in X12 EDI format
  val testSrcs_professional:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-COB-claim-from-billing-provider-to-payer-a.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-COB-claim-from-billing-provider-to-payer-b.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-COB-claim-from-payer-a-to-payer-b-in-payer-to-payer.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-ambulance.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-anesthesia.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-chiropractic.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-commercial-health-insurance.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-drug-administered-in-the-physician-office.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-encounter.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-home-infusion-therapy-pharmacy-(adjudicated-with-HCPCS-in-loop-2400-or-NDC-in-loop-2410).edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-home-infusion-therapy-pharmacy-(adjudicated-with-NDC-in-loop-2410).edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-medicare-secondary-payer-COB.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-out-of-network-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-oxygen.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-ppo-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-wheelchair.edi"
  )

  val testSrcs_institutional:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-automobile-accident.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-out-of-network-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-ppo-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-two-claims-for-the-same-provider.edi"
  )

  val testSrcs_paymentAdvice:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-dollars-and-data-sent-separate.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-dollars-and-data-sent-together.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-era-sample.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-multiple-claims-single-check.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-secondary-payment-with-higher-fee-schedule.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-secondary-payments.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X221 Health Care Claim Payment Advice/X221-tertiary-payments.edi"
  )

  val testSrcs_dental:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-claim-from-billing-provider-to-payer-a.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-claim-from-billing-provider-to-payer-b.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-claim-multi-quantity-single-line.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-commercial-health-insurance.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-multiple-tooth-numbers.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-orthodontic-treatment-plan.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-predetermination-of-benefits.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X224 Health Care Claim Dental/X224-sales-tax.edi"
  )

  val testSrcs_predeterminationProfessional:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-ambulance.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-anesthesia.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-chiropractic.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-commercial-health-insurance.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-drug-administered-in-the-physician-office.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-hmo-plan.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-home-infusion-therapy-pharmacy-(adjudicated-with-HCPCS-in-loop-2400-or-NDC-in-loop-2410).edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-home-infusion-therapy-pharmacy-(adjudicated-with-NDC-in-loop-2410.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-oxygen.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-ppo-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X291 Health Care Predetermination Professional/X291-wheelchair.edi"
  )

  val testSrcs_predeterminationInstitutional:List[String] = List(
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X292 Health Care Predetermination Institutional/X292-837-institutional-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X292 Health Care Predetermination Institutional/X292-out-of-network-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X292 Health Care Predetermination Institutional/X292-ppo-repriced-claim.edi",
    "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X292 Health Care Predetermination Institutional/X292-two-claims-for-the-same-provider.edi"
  )

  "An X12toAvroUtilSpec" should "be able to parse all of the professional X12 format 837 transactions" in {

    testSrcs_professional.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_PROFESSIONAL)

      result should not be (null)
      result should not be (None)
    })
  }

  it should "be able to parse all of the institutional X12 format 837 transactions" in {

    testSrcs_institutional.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_INSTITUTIONAL)

      result should not be (null)
      result should not be (None)
    })
  }

  it should "be able to parse all of the payment advice X12 format 837 transactions" in {

    testSrcs_paymentAdvice.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_PAYMENTADVICE)

      result should not be (null)
      result should not be (None)
    })
  }

  it should "be able to parse all of the dental X12 format 837 transactions" in {

    testSrcs_dental.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_DENTAL)

      result should not be (null)
      result should not be (None)
    })
  }

  it should "be able to parse all of the predetermination professional X12 format 837 transactions" in {

    testSrcs_predeterminationProfessional.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_PROFESSIONAL)

      result should not be (null)
      result should not be (None)
    })
  }

  it should "be able to parse all of the predetermination institutional X12 format 837 transactions" in {

    testSrcs_predeterminationInstitutional.foreach( src => {
      val x12Data = Source.fromURL(getClass.getResource(src)).getLines.toList.mkString("\n")

      val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_PREDETERMINST)

      result should not be (null)
      result should not be (None)
    })
  }

  // TODO: Verify that the parser detects improperly formatted EDI data.  It seems happy with just about any X12 document.
  it should "correctly fail to parse an erroneous example institutional X12 format 837 transaction" in {

    val testSrc = "/x222-encounter-bad-format.edi"

    val x12Data = Source.fromURL(getClass.getResource(testSrc)).getLines.toList.mkString("\n")

    val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_INSTITUTIONAL)

    result should not be (null)
    result should be (None)
  }

  it should "construct a proper X12 document tree from the parsed file" in {

    val testSrc = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi"

    val x12Data = Source.fromURL(parser.getClass.getResource(testSrc)).getLines.toList.mkString("\n")

    val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_INSTITUTIONAL)

    result should not be (null)
    result should not be (None)

    val x12:X12 = result.get

  }

  it should "recognize two equal X12 documents" in {

    val testSrc = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi"

    val x12Data = Source.fromURL(parser.getClass.getResource(testSrc)).getLines.toList.mkString("\n")

    val result:Option[X12] = parser.parseX12Document(x12Data, X12_837_INSTITUTIONAL)

    result should not be (null)
    result should not be (None)

    val x12:X12 = result.get

    X12toAvroUtil.areEqual(x12, x12) should be (true)
  }

  it should "recognize differing X12 documents" in {

    val testSrc1 = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi"
    val testSrc2 = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-COB-claim-from-billing-provider-to-payer-a.edi"

    val x12Data1 = Source.fromURL(parser.getClass.getResource(testSrc1)).getLines.toList.mkString("\n")
    val x12Data2 = Source.fromURL(parser.getClass.getResource(testSrc2)).getLines.toList.mkString("\n")

    val result1:Option[X12] = parser.parseX12Document(x12Data1, X12_837_INSTITUTIONAL)

    result1 should not be (null)
    result1 should not be (None)

    val result2:Option[X12] = parser.parseX12Document(x12Data1, X12_837_INSTITUTIONAL)

    result2 should not be (null)
    result2 should not be (None)

    val x12_a:X12 = result1.get
    val x12_b:X12 = result2.get

    X12toAvroUtil.areEqual(x12_a, x12_b) should be (false)
  }

  it should "yield differing X12 documents when given two differing schemas" in {

    val testSrc1 = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi"
    val testSrc2 = testSrc1

    val x12Data1 = Source.fromURL(parser.getClass.getResource(testSrc1)).getLines.toList.mkString("\n")
    val x12Data2 = Source.fromURL(parser.getClass.getResource(testSrc2)).getLines.toList.mkString("\n")

    val result1:Option[X12] = parser.parseX12Document(x12Data1, X12_837_INSTITUTIONAL)

    result1 should not be (null)
    result1 should not be (None)

    val result2:Option[X12] = parser.parseX12Document(x12Data1, X12_837_INSTITUTIONAL)

    result2 should not be (null)
    result2 should not be (None)

    val x12_a:X12 = result1.get
    val x12_b:X12 = result2.get

    X12toAvroUtil.areEqual(x12_a, x12_b) should be (false)
  }
}
