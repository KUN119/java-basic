package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview intern = new MovieReview();
        intern.title = "인턴";
        intern.review = "나이가 무엇이 중요해";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] movieReviews = {intern, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목:" + movieReview.title + ", 리뷰:" + movieReview.review);
        }
    }
}
