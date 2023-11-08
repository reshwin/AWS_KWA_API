public class Customer {
	private String CONS_NO;
	private String AREA_CODE;
	private String CAT_CODE;
	private String CONS_ID_NO;
	private String CONS_NAME;
	private String ADDRESS1;
	private String ADDRESS2;
	private String ADDRESS3;
	private String ADDRESS4;
	private String PHONE;
	private String ROUTE_CODE;
	private String METER_NO;
	private String METER_FIXATION_DATE;
	private String METER_OWNER;
	private String METER_WORKING;
	private String SMART_METER_FLAG;
	
	public Customer(
			String CONS_NO,
			String AREA_CODE, 
			String CAT_CODE,
			String CONS_ID_NO,
			String CONS_NAME,
			String ADDRESS1,
			String ADDRESS2,
			String ADDRESS3,
			String ADDRESS4,
			String PHONE,
			String ROUTE_CODE,
			String METER_NO,
			String METER_FIXATION_DATE,
			String METER_OWNER,
			String METER_WORKING,
			String SMART_METER_FLAG
	) {
	this.CONS_NO=CONS_NO;
		this.AREA_CODE = AREA_CODE;
		
		this.CAT_CODE=CAT_CODE;
		this.CONS_ID_NO=CONS_ID_NO;
		this.CONS_NAME=CONS_NAME;
		this.ADDRESS1=ADDRESS1;
		this.ADDRESS2=ADDRESS2;
		this.ADDRESS3=ADDRESS3;
		this.ADDRESS4=ADDRESS4;
		this.PHONE=PHONE;
		this.ROUTE_CODE=ROUTE_CODE;
		this.METER_NO=METER_NO;
		this.METER_FIXATION_DATE=METER_FIXATION_DATE;
		this.METER_OWNER=METER_OWNER;
		this.METER_WORKING=METER_WORKING;
		this.SMART_METER_FLAG=SMART_METER_FLAG;
	}
			public String getCONS_NO() {return CONS_NO;}
			public String getAREA_CODE() {return AREA_CODE;}
			public String getCAT_CODE() {return CAT_CODE;}
			public String getCONS_ID_NO() {return CONS_ID_NO;}
			public String getCONS_NAME() {return CONS_NAME;}
			public String getADDRESS1() {return ADDRESS1;}
			public String getADDRESS2() {return ADDRESS2;}
			public String getADDRESS3() {return ADDRESS3;}
			public String getADDRESS4() {return ADDRESS4;}
			public String getPHONE() {return PHONE;}
			public String getROUTE_CODE() {return ROUTE_CODE;}
			public String getMETER_NO() {return METER_NO;}
			public String getMETER_FIXATION_DATE() {return METER_FIXATION_DATE;}
			public String getMETER_OWNER() {return METER_OWNER;}
			public String getMETER_WORKING() {return METER_WORKING;}
			public String getSMART_METER_FLAG() {return SMART_METER_FLAG;}
}