package indi.jackie.toy.designpattern.complex.builderandtemplate;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Disorder 无序构造器
 */
public class Disorder {

    private String name;
    private String address;
    private String phone;
    private String email;

    public static class Builder {
        Disorder disorder = new Disorder();

        public Builder setName(String name) {
            this.disorder.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.disorder.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.disorder.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.disorder.email = email;
            return this;
        }

        public Disorder build() {
            return this.disorder;
        }
    }
}
