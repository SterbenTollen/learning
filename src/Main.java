import java.util.Scanner;

public class Main {

	/**public static boolean login (String email, int mdp, User user){
		System.out.println(user.getMail() + " " + user.getPassid());
	    if ((email == user.getMail())&&(mdp == user.getPassid())) return true;
	    else return false;
	}*/

	public static class User {
		private int passid;
		private String mail;
		private int id;
		private String fullname;
		public User(int passid, String mail, int id, String fullname) {

			this.passid = passid;
			this.mail = mail;
			this.id = id;
			this.fullname = fullname;
		}
		public void setPassid(int passid) {
			this.passid = passid;
		}
		public int getPassid() {
			return passid;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getMail() {
			return mail;
		}

		public void setId ( int id ) { this.id = id; }
		public int getId() { return id; }

		public void setFullname( String fullname) { this.fullname = fullname; }
		public String getFullname () { return fullname ;}
	}

	public static void main(String[] args) {


		int teste = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the email: ");
		String email = scanner.nextLine();
		System.out.printf("Enter the password: ");
		int mdp = scanner.nextInt();

		User[] user = new User[4];
		user[0] = new User(1234, "mail1", 0, "");
		user[1] = new User(12345, "mail2", 2, "");
		user[2] = new User(123456, "mail3", 4, "");
		user[3] = new User(1234567, "mail4", 5, "");

		for (int i = 0; i < user.length; i++) {
			if ((email.equals(user[i].getMail()) && (mdp == user[i].passid))) {
				System.out.println("connected");
				teste = 1;
				break;
			}


		}
		if (teste == 0) System.out.println("this account doesnt exist");
	}

}
