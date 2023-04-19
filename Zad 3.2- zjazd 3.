class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Author name= " + getName() + " surname = " + getSurname() + ", age = " + getAge();
    }
}

class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Bolesław", "Prus", 50);
        author.setSurname("Nowak");
        System.out.println(author);

        Author author2= new Author("Bolesław","Prus", 50);
        author2.setSurname("Kowalski");
        System.out.println(author2);

        Author author3= new Author("Eliza","Prus", 25);
        author3.setSurname("Wawelska");
        System.out.println(author3);

        Author author4= new Author("Eliza",null, 25);
        System.out.println(author4);
    }
}
