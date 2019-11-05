package com.example.csdj.branch.entity;

public class Member {
    private int memId;//党员id
    private String memName;//党员姓名
    private String memPwd;//党员密码
    private String email;//电子邮箱
    private String tel;//党员电话
    private int duty;//职务外键
    private String idnum;//身份证号
    private String joinTime;//入党时间
    private int department;//部门外键
    private String site;//籍贯
    private String img;//照片
    private String sex;//性别
    private int age;//年龄
    private String resume;//简历
    private String background;//学历
    private int flag;//状态  0 审核中 1审核通过2审核未通过
    private Integer member_flag;
    private String nation;//民族
    private Record record;
    private TbFamily tbFamily;
    private String dutyName;// 职务名称
    private String depaName;//党支部名称

    public String getDepaName() {
        return depaName;
    }

    public void setDepaName(String depaName) {
        this.depaName = depaName;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public TbFamily getTbFamily() {
        return tbFamily;
    }

    public void setTbFamily(TbFamily tbFamily) {
        this.tbFamily = tbFamily;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getMember_flag() {
        return member_flag;
    }

    public void setMember_flag(Integer member_flag) {
        this.member_flag = member_flag;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public int getDuty() {
        return duty;
    }

    public void setDuty(int duty) {
        this.duty = duty;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }



    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return  memName ;
    }
}
