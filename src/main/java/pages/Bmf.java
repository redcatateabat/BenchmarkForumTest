package pages;

import assets.Fixtures;

public class Bmf extends BasePage {

    private ForumTopicsPage forumTopicsPage;
    private LoginModal loginModal;
    private Fixtures fixtures;

    public ForumTopicsPage getForumTopicsPage() {

        if (forumTopicsPage == null) {
            forumTopicsPage = new ForumTopicsPage();
        }

        return forumTopicsPage;
    }

    public LoginModal getLoginModal() {

        if (loginModal == null) {
            loginModal = new LoginModal();
        }

        return loginModal;
    }

    public Fixtures getFixtures() {

        if (fixtures == null) {
            fixtures = new Fixtures();
        }
        return fixtures;
    }
}
