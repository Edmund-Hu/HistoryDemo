package com.santbbd.entity;

public enum TypeNameEnum {

    one("统一社会信用代码", "credentialNo"), two("企业名称", "companyName"), four("法定代表人", "pfrHeadName"),
    five("注册资本", "regCap"), six("成立日期", "esDate"), seven("营业期限自", "credentialStartDate"), 
    eight("营业期限至","creditNoEndDate"),twelve("住所", "operateAddress"), thirteen("经营范围", "operateScope"),
    fiftteen("营业场所","operateAddress"),sixteen("注册号", "credentialNo"),seventeen("负责人", "pfrHeadName"),
    eighteen("名称", "companyName"),nineteen("经营者", "pfrHeadName"),tweenty("注册日期", "esDate"),tweentyOne("成员出资总额", "regCap"),
    tweentyTwo("业务范围", "operateScope"),tweentyThree("经营场所","operateAddress");

    private String typeName;

    private String typeCode;

    TypeNameEnum(String typeName, String typeCode) {
        this.typeName = typeName;
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public static TypeNameEnum getExamType(String value) {
        for (TypeNameEnum examType : TypeNameEnum.values()) {
            if (value.equals(examType.getTypeCode())) {
                return examType;
            }
            for (TypeNameEnum examName : TypeNameEnum.values()) {
                if (value.equals(examName.getTypeName())) {
                    return examName;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String a = "注册号";
      System.out.println(TypeNameEnum.getExamType(a).getTypeCode());  ;
    }
}
