import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Online Resume Builder");

 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();


        System.out.println("\nEducational Background:");
        System.out.print("Enter your degree: ");
        String degree = scanner.nextLine();
        System.out.print("Enter your university: ");
        String university = scanner.nextLine();
        System.out.print("Enter graduation year: ");
        String graduationYear = scanner.nextLine();

    
        System.out.println("\nWork Experience:");
        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter the company: ");
        String company = scanner.nextLine();
        System.out.print("Enter employment duration: ");
        String employmentDuration = scanner.nextLine();

        
        System.out.println("\nGenerated Resume:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("\nEducational Background:");
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("\nWork Experience:");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Employment Duration: " + employmentDuration);

        scanner.close();
    }
}
