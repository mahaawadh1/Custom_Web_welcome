package com.letcode.SecureBankSystem.Controller;

public class Contact {

        private String name ;
        private String email;
        private String phone ;

        public Contact(String name, String email, String phone) {
            this.name=name;
            this.phone=phone;
            this.email=email;
        }


        public String getName() {
            return name;
        }


        public String getEmail() {
            return email;
        }


        public String getPhone() {
            return phone;
        }

    }

