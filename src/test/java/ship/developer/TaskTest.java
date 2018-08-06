package ship.developer;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import ship.developer.entity.Person;

import java.util.*;

import static org.junit.Assert.*;

public class TaskTest {

    String[] names = ("Carlos\tHansen\n" +
            "Stacey\tObrien\n" +
            "Suzanne\tBarker\n" +
            "Shirley\tTorres\n" +
            "Betty\tMalone\n" +
            "Sylvia\tVega\n" +
            "Julia\tJackson\n" +
            "Yvette\tFreeman\n" +
            "Gladys\tArnold\n" +
            "Tammy\tDixon\n" +
            "Nina\tPatton\n" +
            "Misty\tSherman\n" +
            "Nancy\tDiaz\n" +
            "Tracey\tDavidson\n" +
            "Sara\tJefferson\n" +
            "Oliver\tCarlson\n" +
            "Annette\tWilkerson\n" +
            "Irma\tOlson\n" +
            "Kara\tBaker\n" +
            "Kathleen\tMills\n" +
            "Annie\tEstrada\n" +
            "Forrest\tPearson\n" +
            "Everett\tSimon\n" +
            "Dewey\tPittman\n" +
            "Maryann\tHiggins\n" +
            "Winifred\tWatson\n" +
            "Arlene\tSullivan\n" +
            "Kevin\tBrewer\n" +
            "Ana\tOrtiz\n" +
            "Dwight\tGraves\n" +
            "Gail\tCarpenter\n" +
            "Marvin\tTate\n" +
            "Lula\tCastro\n" +
            "Stacy\tDaniels\n" +
            "Lynda\tTaylor\n" +
            "Renee\tWells\n" +
            "Theresa\tTyler\n" +
            "Diane\tLynch\n" +
            "Pamela\tGrant\n" +
            "Kari\tPerry\n" +
            "Joyce\tThornton\n" +
            "Marian\tWood\n" +
            "Ruben\tHawkins\n" +
            "Harvey\tRiley\n" +
            "Glen\tMedina\n" +
            "Jodi\tMunoz\n" +
            "Zachary\tWebster\n" +
            "Courtney\tWilliamson\n" +
            "Kelvin\tNeal\n" +
            "Clayton\tRodgers\n" +
            "Marianne\tRichardson\n" +
            "Marlon\tValdez\n" +
            "Terrell\tCooper\n" +
            "Tomas\tGreene\n" +
            "Wm\tSimmons\n" +
            "Mindy\tReynolds\n" +
            "Andre\tMontgomery\n" +
            "Mercedes\tJennings\n" +
            "Kristy\tSaunders\n" +
            "Elaine\tStevens\n" +
            "Theodore\tLucas\n" +
            "Frankie\tHammond\n" +
            "Guadalupe\tHampton\n" +
            "Jaime\tBennett\n" +
            "Nathaniel\tHowell\n" +
            "Micheal\tSummers\n" +
            "Kerry\tRivera\n" +
            "John\tVargas\n" +
            "Tyler\tWalton\n" +
            "Katie\tKelly\n" +
            "Phillip\tLewis\n" +
            "Otis\tSnyder\n" +
            "Alice\tLane\n" +
            "Rafael\tJordan\n" +
            "Max\tMarsh\n" +
            "Verna\tCox\n" +
            "Erik\tHarper\n" +
            "Alton\tBarber\n" +
            "Donnie\tLopez\n" +
            "Jaime\tHogan\n" +
            "Tracy\tShaw\n" +
            "Sherry\tCummings\n" +
            "Meredith\tColeman\n" +
            "Homer\tNewman\n" +
            "Sheri\tWarner\n" +
            "Byron\tPrice\n" +
            "Lyle\tBailey\n" +
            "Melissa\tSutton\n" +
            "Lawrence\tCraig\n" +
            "Danielle\tRyan\n" +
            "Jennie\tThompson\n" +
            "Debbie\tClayton\n" +
            "Jackie\tDelgado\n" +
            "Rhonda\tKim\n" +
            "Henrietta\tWarren\n" +
            "Lillian\tIngram\n" +
            "Jeffery\tNelson\n" +
            "Heather\tHayes\n" +
            "Enrique\tBowers\n" +
            "Victor\tCastillo").split("\\n");

    @Test
    public void testTask1(){
        int[] mass = new int[30];
        String line = "Certe, inquam, pertinax non ero tibique, si mihi probabis ea, quae dices, libenter assentiar.Probabo, inquit, modo ista sis aequitate, quam ostendis.Sed uti oratione perpetua malo quam interrogare aut interrogari.Ut placet, inquam.Tum dicere exorsus est.Primum igitur, inquit, sic agam, ut ipsi auctori huius disciplinae placet: constituam, quid et quale sit id, de quo quaerimus, non quo ignorare vos arbitrer, sed ut ratione et via procedat oratio.Quaerimus igitur, quid sit extremum et ultimum bonorum, quod omnium philosophorum sententia tale debet esse, ut ad id omnia referri oporteat, ipsum autem nusquam.Hoc Epicurus in voluptate ponit, quod summum bonum esse vult, summumque malum dolorem, idque instituit docere sic.Omne animal, simul atque natum sit, voluptatem appetere eaque gaudere ut summo bono, dolorem aspernari ut summum malum et, quantum possit, a se repellere, idque facere nondum depravatum ipsa natura incorrupte atque integre iudicante.Itaque negat opus esse ratione neque disputatione, quam ob rem voluptas expetenda, fugiendus dolor sit.Sentiri haec putat, ut calere ignem, nivem esse albam, dulce mel.Quorum nihil oportere exquisitis rationibus confirmare, tantum satis esse admonere.Interesse enim inter argumentum conclusionemque rationis et inter mediocrem animadversionem atque admonitionem.Altera occulta quaedam et quasi involuta aperiri, altera prompta et aperta iudicari.Etenim quoniam detractis de homine sensibus reliqui nihil est, necesse est, quid aut ad naturam aut contra sit, a natura ipsa iudicari.Ea quid percipit aut quid iudicat, quo aut petat aut fugiat aliquid, praeter voluptatem et dolorem?Sunt autem quidam e nostris, qui haec subtilius velint tradere et negent satis esse, quid bonum sit aut quid malum, sensu iudicari, sed animo etiam ac ratione intellegi posse et voluptatem ipsam per se esse expetendam et dolorem ipsum per se esse fugiendum.Itaque aiunt hanc quasi naturalem atque insitam in animis nostris inesse notionem, ut alterum esse appetendum, alterum aspernandum sentiamus.Alii autem, quibus ego assentior, cum a philosophis compluribus permulta dicantur, cur nec voluptas in bonis sit numeranda nec in malis dolor, non existimant oportere nimium nos causae confidere, sed et argumentandum et accurate disserendum et rationibus conquisitis de voluptate et dolore disputandum putant.Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.\n" +
                "Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem.Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur?At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga.Et harum quidem rerum facilis est et expedita distinctio.Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates repudiandae sint et molestiae non recusandae.Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.Hanc ego cum teneam sententiam, quid est cur verear, ne ad eam non possim accommodare Torquatos nostros? quos tu paulo ante cum memoriter, tum etiam erga nos amice et benivole collegisti, nec me tamen laudandis maioribus meis corrupisti nec segniorem ad respondendum reddidisti.Quorum facta quem ad modum, quaeso, interpretaris? sicine eos censes aut in armatum hostem impetum fecisse aut in liberos atque in sanguinem suum tam crudelis fuisse, nihil ut de utilitatibus, nihil ut de commodis suis cogitarent? at id ne ferae quidem faciunt, ut ita ruant itaque turbent, ut earum motus et impetus quo pertineant non intellegamus, tu tam egregios viros censes tantas res gessisse sine causa?Quae fuerit causa, mox videro; interea hoc tenebo, si ob aliquam causam ista, quae sine dubio praeclara sunt, fecerint, virtutem iis per se ipsam causam non fuisse.-- Torquem detraxit hosti.-- Et quidem se texit, ne interiret.-- At magnum periculum adiit.-- In oculis quidem exercitus.-- Quid ex eo est consecutus?-- Laudem et caritatem, quae sunt vitae sine metu degendae praesidia firmissima.-- Filium morte multavit.-- Si sine causa, nollem me ab eo ortum, tam inportuno tamque crudeli; sin, ut dolore suo sanciret militaris imperii disciplinam exercitumque in gravissimo bello animadversionis metu contineret, saluti prospexit civium, qua intellegebat contineri suam.Atque haec ratio late patet.In quo enim maxime consuevit iactare vestra se oratio, tua praesertim, qui studiose antiqua persequeris, claris et fortibus viris commemorandis eorumque factis non emolumento aliquo, sed ipsius honestatis decore laudandis, id totum evertitur eo delectu rerum, quem modo dixi, constituto, ut aut voluptates omittantur maiorum voluptatum adipiscendarum causa aut dolores suscipiantur maiorum dolorum effugiendorum gratia.\n" +
                "Certe, inquam, pertinax non ero tibique, si mihi probabis ea, quae dices, libenter assentiar.Probabo, inquit, modo ista sis aequitate, quam ostendis.Sed uti oratione perpetua malo quam interrogare aut interrogari.Ut placet, inquam.Tum dicere exorsus est.Primum igitur, inquit, sic agam, ut ipsi auctori huius disciplinae placet: constituam, quid et quale sit id, de quo quaerimus, non quo ignorare vos arbitrer, sed ut ratione et via procedat oratio.Quaerimus igitur, quid sit extremum et ultimum bonorum, quod omnium philosophorum sententia tale debet esse, ut ad id omnia referri oporteat, ipsum autem nusquam.Hoc Epicurus in voluptate ponit, quod summum bonum esse vult, summumque malum dolorem, idque instituit docere sic.Omne animal, simul atque natum sit, voluptatem appetere eaque gaudere ut summo bono, dolorem aspernari ut summum malum et, quantum possit, a se repellere, idque facere nondum depravatum ipsa natura incorrupte atque integre iudicante.Itaque negat opus esse ratione neque disputatione, quam ob rem voluptas expetenda, fugiendus dolor sit.Sentiri haec putat, ut calere ignem, nivem esse albam, dulce mel.Quorum nihil oportere exquisitis rationibus confirmare, tantum satis esse admonere.Interesse enim inter argumentum conclusionemque rationis et inter mediocrem animadversionem atque admonitionem.Altera occulta quaedam et quasi involuta aperiri, altera prompta et aperta iudicari.Etenim quoniam detractis de homine sensibus reliqui nihil est, necesse est, quid aut ad naturam aut contra sit, a natura ipsa iudicari.Ea quid percipit aut quid iudicat, quo aut petat aut fugiat aliquid, praeter voluptatem et dolorem?Sunt autem quidam e nostris, qui haec subtilius velint tradere et negent satis esse, quid bonum sit aut quid malum, sensu iudicari, sed animo etiam ac ratione intellegi posse et voluptatem ipsam per se esse expetendam et dolorem ipsum per se esse fugiendum.Itaque aiunt hanc quasi naturalem atque insitam in animis nostris inesse notionem, ut alterum esse appetendum, alterum aspernandum sentiamus.Alii autem, quibus ego assentior, cum a philosophis compluribus permulta dicantur, cur nec voluptas in bonis sit numeranda nec in malis dolor, non existimant oportere nimium nos causae confidere, sed et argumentandum et accurate disserendum et rationibus conquisitis de voluptate et dolore disputandum putant.Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.\n" +
                "Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem.Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur?At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga.Et harum quidem rerum facilis est et expedita distinctio.Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates repudiandae sint et molestiae non recusandae.Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.Hanc ego cum teneam sententiam, quid est cur verear, ne ad eam non possim accommodare Torquatos nostros? quos tu paulo ante cum memoriter, tum etiam erga nos amice et benivole collegisti, nec me tamen laudandis maioribus meis corrupisti nec segniorem ad respondendum reddidisti.Quorum facta quem ad modum, quaeso, interpretaris? sicine eos censes aut in armatum hostem impetum fecisse aut in liberos atque in sanguinem suum tam crudelis fuisse, nihil ut de utilitatibus, nihil ut de commodis suis cogitarent? at id ne ferae quidem faciunt, ut ita ruant itaque turbent, ut earum motus et impetus quo pertineant non intellegamus, tu tam egregios viros censes tantas res gessisse sine causa?Quae fuerit causa, mox videro; interea hoc tenebo, si ob aliquam causam ista, quae sine dubio praeclara sunt, fecerint, virtutem iis per se ipsam causam non fuisse.-- Torquem detraxit hosti.-- Et quidem se texit, ne interiret.-- At magnum periculum adiit.-- In oculis quidem exercitus.-- Quid ex eo est consecutus?-- Laudem et caritatem, quae sunt vitae sine metu degendae praesidia firmissima.-- Filium morte multavit.-- Si sine causa, nollem me ab eo ortum, tam inportuno tamque crudeli; sin, ut dolore suo sanciret militaris imperii disciplinam exercitumque in gravissimo bello animadversionis metu contineret, saluti prospexit civium, qua intellegebat contineri suam.Atque haec ratio late patet.In quo enim maxime consuevit iactare vestra se oratio, tua praesertim, qui studiose antiqua persequeris, claris et fortibus viris commemorandis eorumque factis non emolumento aliquo, sed ipsius honestatis decore laudandis, id totum evertitur eo delectu rerum, quem modo dixi, constituto, ut aut voluptates omittantur maiorum voluptatum adipiscendarum causa aut dolores suscipiantur maiorum dolorum effugiendorum gratia.\n" +
                "Certe, inquam, pertinax non ero tibique, si mihi probabis ea, quae dices, libenter assentiar.Probabo, inquit, modo ista sis aequitate, quam ostendis.Sed uti oratione perpetua malo quam interrogare aut interrogari.Ut placet, inquam.Tum dicere exorsus est.Primum igitur, inquit, sic agam, ut ipsi auctori huius disciplinae placet: constituam, quid et quale sit id, de quo quaerimus, non quo ignorare vos arbitrer, sed ut ratione et via procedat oratio.Quaerimus igitur, quid sit extremum et ultimum bonorum, quod omnium philosophorum sententia tale debet esse, ut ad id omnia referri oporteat, ipsum autem nusquam.Hoc Epicurus in voluptate ponit, quod summum bonum esse vult, summumque malum dolorem, idque instituit docere sic.Omne animal, simul atque natum sit, voluptatem appetere eaque gaudere ut summo bono, dolorem aspernari ut summum malum et, quantum possit, a se repellere, idque facere nondum depravatum ipsa natura incorrupte atque integre iudicante.Itaque negat opus esse ratione neque disputatione, quam ob rem voluptas expetenda, fugiendus dolor sit.Sentiri haec putat, ut calere ignem, nivem esse albam, dulce mel.Quorum nihil oportere exquisitis rationibus confirmare, tantum satis esse admonere.Interesse enim inter argumentum conclusionemque rationis et inter mediocrem animadversionem atque admonitionem.Altera occulta quaedam et quasi involuta aperiri, altera prompta et aperta iudicari.Etenim quoniam detractis de homine sensibus reliqui nihil est, necesse est, quid aut ad naturam aut contra sit, a natura ipsa iudicari.Ea quid percipit aut quid iudicat, quo aut petat aut fugiat aliquid, praeter voluptatem et dolorem?Sunt autem quidam e nostris, qui haec subtilius velint tradere et negent satis esse, quid bonum sit aut quid malum, sensu iudicari, sed animo etiam ac ratione intellegi posse et voluptatem ipsam per se esse expetendam et dolorem ipsum per se esse fugiendum.Itaque aiunt hanc quasi naturalem atque insitam in animis nostris inesse notionem, ut alterum esse appetendum, alterum aspernandum sentiamus.Alii autem, quibus ego assentior, cum a philosophis compluribus permulta dicantur, cur nec voluptas in bonis sit numeranda nec in malis dolor, non existimant oportere nimium nos causae confidere, sed et argumentandum et accurate disserendum et rationibus conquisitis de voluptate et dolore disputandum putant.Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.\n";
        String[] words = line.split("\\s+");
        int length = 0;
        for(String word : words) {
            length = word.length();
            for (int i = 0; i < word.length(); i++) {
                if (!((word.charAt(i) >= '0' && word.charAt(i) <= '9') || (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'))) {
                    length--;
                }
            }
            mass[length]++;
        }
        Map<Integer, Integer> map = Task1.getLengthOfWords(line, true);
        for(int i = 0; i < mass.length; i++){
            if(mass[i] != 0){
                assertEquals(map.get(i).intValue(), mass[i]);
            }
        }
    }

    @Test
    public void testTask2(){
        List<Person> people = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 50000; i++){
            people.add(new Person(names[random.nextInt(names.length)], random.nextInt(80)+ 18));
        }
        List<Person> copyPeople = new ArrayList<>(people);
        List<Person> result = Task2.deleteEveryFifthPerson(people);
        int length = copyPeople.size();
        for(int i = length; i >= 0; i--){
            if((i + 1) % 8 == 0){
                copyPeople.remove(i);
            }
        }
        assertArrayEquals(result.toArray(), copyPeople.toArray());
    }

    @Test
    public void testTask3(){
        List<Person> people = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 50000; i++){
            people.add(new Person(names[random.nextInt(names.length)], random.nextInt(80)+ 18));
        }
        BinaryTree<Person> binaryTree = new BinaryTree<>();
        for(int i = 0; i < people.size(); i++) {
            binaryTree.add(people.get(random.nextInt(people.size())));
        }

    }
}