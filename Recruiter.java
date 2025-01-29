import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "recruiter")
public class Recruiter {
    private int recruiter_id;
    private String recruiter_name;
    private String recruiter_address;
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getRecruiterId() {
        return recruiter_id;
    }

    public void setRecruiterId(int recruiter_id) {
        this.recruiter_id = recruiter_id;
    }

    public String getRecruiterName() {
        return recruiter_name;
    }

    public void setRecruiterName(String recruiter_name) {
        this.recruiter_name = recruiter_name;
    }

    public String getRecruiterAddress() {
        return recruiter_address;
    }

    public void setRecruiterAddress(String recruiter_address) {
        this.recruiter_address = recruiter_address;
    }

}

