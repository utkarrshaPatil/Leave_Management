package com.project.CaseStudy;

public class Employee {

	private int EmployeeID;
	private String EmployeeName;
	private int JanLV;
	private int FebLV;
	private int MarLV;
	private int AprLV;
	private int MayLV;
	private int JunLV;
	private int JulLV;
	private int AugLV;
	private int SeptLV;
	private int OctLV;
	private int NovLV;
	private int DecLV;
	private int TOTALLEAVE;
	
	
	
	public Employee(int employeeID, String employeeName, int janLV, int febLV, int marLV, int aprLV, int mayLV,
			int junLV, int julLV, int augLV, int septLV, int octLV, int novLV, int decLV, int tOTALLEAVE) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		JanLV = janLV;
		FebLV = febLV;
		MarLV = marLV;
		AprLV = aprLV;
		MayLV = mayLV;
		JunLV = junLV;
		JulLV = julLV;
		AugLV = augLV;
		SeptLV = septLV;
		OctLV = octLV;
		NovLV = novLV;
		DecLV = decLV;
		TOTALLEAVE = tOTALLEAVE;
	}
	
	public Employee(){
		
	}
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", JanLV=" + JanLV + ", FebLV="
				+ FebLV + ", MarLV=" + MarLV + ", AprLV=" + AprLV + ", MayLV=" + MayLV + ", JunLV=" + JunLV + ", JulLV="
				+ JulLV + ", AugLV=" + AugLV + ", SeptLV=" + SeptLV + ", OctLV=" + OctLV + ", NovLV=" + NovLV
				+ ", DecLV=" + DecLV + ", TOTALLEAVE=" + TOTALLEAVE + "]";
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getJanLV() {
		return JanLV;
	}
	public void setJanLV(int janLV) {
		JanLV = janLV;
	}
	public int getFebLV() {
		return FebLV;
	}
	public void setFebLV(int febLV) {
		FebLV = febLV;
	}
	public int getMarLV() {
		return MarLV;
	}
	public void setMarLV(int marLV) {
		MarLV = marLV;
	}
	public int getAprLV() {
		return AprLV;
	}
	public void setAprLV(int aprLV) {
		AprLV = aprLV;
	}
	public int getMayLV() {
		return MayLV;
	}
	public void setMayLV(int mayLV) {
		MayLV = mayLV;
	}
	public int getJunLV() {
		return JunLV;
	}
	public void setJunLV(int junLV) {
		JunLV = junLV;
	}
	public int getJulLV() {
		return JulLV;
	}
	public void setJulLV(int julLV) {
		JulLV = julLV;
	}
	public int getAugLV() {
		return AugLV;
	}
	public void setAugLV(int augLV) {
		AugLV = augLV;
	}
	public int getSeptLV() {
		return SeptLV;
	}
	public void setSeptLV(int septLV) {
		SeptLV = septLV;
	}
	public int getOctLV() {
		return OctLV;
	}
	public void setOctLV(int octLV) {
		OctLV = octLV;
	}
	public int getNovLV() {
		return NovLV;
	}
	public void setNovLV(int novLV) {
		NovLV = novLV;
	}
	public int getDecLV() {
		return DecLV;
	}
	public void setDecLV(int decLV) {
		DecLV = decLV;
	}
	public int getTOTALLEAVE() {
		return TOTALLEAVE;
	}
	public void setTOTALLEAVE(int tOTALLEAVE) {
		TOTALLEAVE = tOTALLEAVE;
	}
	
	
}
