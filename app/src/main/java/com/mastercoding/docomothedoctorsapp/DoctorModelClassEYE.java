package com.mastercoding.docomothedoctorsapp;

public class DoctorModelClassEYE {

    private String DocName, DocNumber, DocAddress;
    private int DocImg;

    public DoctorModelClassEYE(String docName, String docNumber, String docAddress, int docImg) {
        DocName = docName;
        DocNumber = docNumber;
        DocAddress = docAddress;
        DocImg = docImg;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        this.DocName = docName;
    }

    public String getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(String docNumber) {
        this.DocNumber = docNumber;
    }

    public String getDocAddress() {
        return DocAddress;
    }

    public void setDocAddress(String docAddress) {
        this.DocAddress = docAddress;
    }

    public int getDocImg() {
        return DocImg;
    }

    public void setDocImg(int docImg) {
        this.DocImg = docImg;
    }
}
