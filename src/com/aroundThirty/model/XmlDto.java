package com.aroundThirty.model;

public class XmlDto {
    public int happenDt = 0; // 발견날짜
    public String happenPlace = null; // 발견장소
    public String kindCd = null; // 품종(종류 포함)
    public String sexCd = null; // 성별
    public String processState = null; //상태
    public String specialMark = null; // 특징
    public String fileName = null; // 유기동물 사진
    public String age = null; //유기동물 나이
    public String colorCd = null; // 유기동물 색깔
    public String neuterYn = null; // 중성화 여부
    public String orgNm = null; // 시, 도 이름
    public String weight = null; // 유기동물 몸무게

    // SelectAll
    public XmlDto(String age, String colorCd,String fileName,int happenDt,String happenPlace, String kindCd, String neuterYn, String orgNm, String processState,String sexCd,String specialMark,String weight) {
        this.age = age;
        this.colorCd = colorCd;
        this.fileName = fileName;
        this.happenDt = happenDt;
        this.happenPlace = happenPlace;
        this.kindCd = kindCd;
        this.neuterYn = neuterYn;
        this.orgNm = orgNm;
        this.processState = processState;
        this.sexCd = sexCd;
        this.specialMark = specialMark;
        this.weight = weight;
    }


    public int getHappenDt() {
        return happenDt;
    }

    public void setHappenDt(int happenDt) {
        this.happenDt = happenDt;
    }

    public String getHappenPlace() {
        return happenPlace;
    }

    public void setHappenPlace(String happenPlace) {
        this.happenPlace = happenPlace;
    }

    public String getKindCd() {
        return kindCd;
    }

    public void setKindCd(String kindCd) {
        this.kindCd = kindCd;
    }

    public String getSexCd() {
        return sexCd;
    }

    public void setSexCd(String sexCd) {
        this.sexCd = sexCd;
    }

    public String getProcessState() {
        return processState;
    }

    public void setProcessState(String processState) {
        this.processState = processState;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColorCd() {
        return colorCd;
    }

    public void setColorCd(String colorCd) {
        this.colorCd = colorCd;
    }

    public String getNeuterYn() {
        return neuterYn;
    }

    public void setNeuterYn(String neuterYn) {
        this.neuterYn = neuterYn;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return happenDt + happenPlace + kindCd + sexCd + processState + specialMark + fileName + age + colorCd + neuterYn + orgNm + weight;
    }
}