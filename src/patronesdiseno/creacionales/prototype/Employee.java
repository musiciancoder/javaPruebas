package patronesdiseno.creacionales.prototype;


    //Obviamente nunca tan weon como para sobrescribir hashcode o equals!
    class Employee implements Cloneable { //Para crear shallow clone debemos implementar Cloneable y sobreescribir el metodo clone haciendolo publico en vez de protected.

        private int id;
        private String name;
        private int age;
        private String email;
        private String password;

        public Employee(int id, String name, int age, String email, String password) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }


/*        @Override
        public String toString() {
            return "id: " + this.id +" name:" + this.name + " age: " +this.age + " email: " + this.email + " password: " +this.password;
        }*/


    }


