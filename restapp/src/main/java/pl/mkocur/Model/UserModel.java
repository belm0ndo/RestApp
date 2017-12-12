package pl.mkocur.Model;

/**
 * Created by Mateusz on 12.12.2017.
 */
public class UserModel {

    private String _userName;

    private Long _salary;

    public UserModel(String _userName, Long _salary) {
        this._userName = _userName;
        this._salary = _salary;
    }

    public String get_userName() {
        return _userName;
    }

    public void set_userName(String _userName) {
        this._userName = _userName;
    }

    public Long get_salary() {
        return _salary;
    }

    public void set_salary(Long _salary) {
        this._salary = _salary;
    }
}
