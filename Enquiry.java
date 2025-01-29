import java.util.Date;

@Entity
@Table(name = "Enquiry")
public class Enquiry {
    private int enquiryId;
    private String enquirerName;
    private String enquirerAddress;
    private int enquirerMobile;
    private int enquirerAlternateMobile;
    private String enquirerEmailId; 
    private Date enquiryDate; 
    private String enquirerQuery;
    private int closureReasonId; 
    private String closureReason;
    private boolean enquiryProcessedFlag; 
    private int courseId;
    private int staffId; 
    private String studentName;
    private int inquiryCounter; 
    private Date followUpDate;

   
    public int getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(int enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getEnquirerName() {
        return enquirerName;
    }

    public void setEnquirerName(String enquirerName) {
        this.enquirerName = enquirerName;
    }

    public String getEnquirerAddress() {
        return enquirerAddress;
    }

    public void setEnquirerAddress(String enquirerAddress) {
        this.enquirerAddress = enquirerAddress;
    }

    public int getEnquirerMobile() {
        return enquirerMobile;
    }

    public void setEnquirerMobile(int enquirerMobile) {
        this.enquirerMobile = enquirerMobile;
    }

    public int getEnquirerAlternateMobile() {
        return enquirerAlternateMobile;
    }

    public void setEnquirerAlternateMobile(int enquirerAlternateMobile) {
        this.enquirerAlternateMobile = enquirerAlternateMobile;
    }

    public String getEnquirerEmailId() {
        return enquirerEmailId;
    }

    public void setEnquirerEmailId(String enquirerEmailId) {
        this.enquirerEmailId = enquirerEmailId;
    }

    public Date getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(Date enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    public String getEnquirerQuery() {
        return enquirerQuery;
    }

    public void setEnquirerQuery(String enquirerQuery) {
        this.enquirerQuery = enquirerQuery;
    }

    public int getClosureReasonId() {
        return closureReasonId;
    }

    public void setClosureReasonId(int closureReasonId) {
        this.closureReasonId = closureReasonId;
    }

    public String getClosureReason() {
        return closureReason;
    }

    public void setClosureReason(String closureReason) {
        this.closureReason = closureReason;
    }

    public boolean isEnquiryProcessedFlag() {
        return enquiryProcessedFlag;
    }

    public void setEnquiryProcessedFlag(boolean enquiryProcessedFlag) {
        this.enquiryProcessedFlag = enquiryProcessedFlag;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getInquiryCounter() {
        return inquiryCounter;
    }

    public void setInquiryCounter(int inquiryCounter) {
        this.inquiryCounter = inquiryCounter;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }
}