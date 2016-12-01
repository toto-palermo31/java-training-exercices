package io.robusta.people.forum;

import java.util.TreeSet;

import io.robusta.people.Admin;
import io.robusta.people.User;

public class ForumApplication {

	public static void main(String[] args) {

		User pilou = new User("Pilou", "pilou@aelion.fr");
		pilou.setAge(40);

		System.out.println(pilou);

		Comment monComment = new Comment("cool on avance!");

		System.out.println(monComment.html());

		System.out.println(monComment.html(pilou));

		Admin hercule = new Admin("Hercule");
		hercule.setAge(150);
		System.out.println(hercule);

		ImageComment ic = new ImageComment("cool on avance!", pilou,
				"http://publicdomainvectors.org/photos/1293113778.png");

		System.out.println(ic.html());

		monComment.addFlag("pas cool");
		monComment.addFlag("pouet trop  cool");

		System.out.println(monComment.isFlagged());
		ic.score = 26;
		monComment.score = 3;
		TreeSet<Comment> comments = new TreeSet<>();
		comments.add(monComment);
		comments.add(ic);

		System.out.println(comments);
	}

}
