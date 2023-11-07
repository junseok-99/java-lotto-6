package lotto;

import java.util.List;
import repository.RankRepository;
import view.OutputView;

public class Application {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6);
        List<Integer> list2 = List.of(1,2,3,4,5,6);
        Lotto lotto = new Lotto(list);

        Integer sameSount = lotto.getSameNumberCount(list2);

        if (sameSount == 6) {
            RankRepository.increaseNumberOfWins(1);
            RankRepository.increaseNumberOfWins(1);
            RankRepository.increaseNumberOfWins(1);
            RankRepository.increaseNumberOfWins(1);
            RankRepository.increaseNumberOfWins(1);
        }

        OutputView.outputWinningStatistics();
    }
}
