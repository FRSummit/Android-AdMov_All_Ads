package com.example.coronavirus_howlongdoesittaketorecover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecoverTime extends Activity {
    TextView recover_text_1,
            body_fight,
            body_fight_text,
            recover_time,
            recover_time_text,
            stop_isolation,
            stop_isolation_text,
            contagious_time,
            contagious_time_text,
            recovers_immune,
            recovers_immune_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_time);

        recover_text_1 = (TextView) findViewById(R.id.recover_text_1);

        body_fight = (TextView) findViewById(R.id.body_fight);
        body_fight_text = (TextView) findViewById(R.id.body_fight_text);

        recover_time = (TextView) findViewById(R.id.recover_time);
        recover_time_text = (TextView) findViewById(R.id.recover_time_text);

        stop_isolation = (TextView) findViewById(R.id.stop_isolation);
        stop_isolation_text = (TextView) findViewById(R.id.stop_isolation_text);

        contagious_time = (TextView) findViewById(R.id.contagious_time);
        contagious_time_text = (TextView) findViewById(R.id.contagious_time_text);

        recovers_immune = (TextView) findViewById(R.id.recovers_immune);
        recovers_immune_text = (TextView) findViewById(R.id.recovers_immune_text);

        recover_text_1.setText("As the number of coronavirus cases continues to climb worldwide, so does another figure: people who have recovered from COVID-19.\n" +
                "\n" +
                "About 80% of COVID-19 cases are mild and don't require hospital care, health experts say. More than 467,000 people had recovered from the virus worldwide as of Tuesday, according to data from Johns Hopkins University. About 44,000 of those cases were in the U.S.\n" +
                "\n" +
                "Recovery numbers may be underestimated because of limited testing and varied reporting methods from local health departments, health experts say.\n" +
                "\n" +
                "But the numbers indicate most people are able to ride out the disease and make a full recovery from the comfort of their homes.\n" +
                "\n" +
                "But how long does it take to get over the virus, and when can you stop isolating yourself if you're treating it at home? Here's what you need to know.");


        body_fight.setText("How does the body fight off COVID-19?");
        body_fight_text.setText("A virus attacks host cells in the body as it reproduces. Your immune system will start producing antibodies to fight the disease. During the immune system's response to infection, a substance called a pyrogen is released, which causes a fever and helps you fight infection.\n" +
                "\n" +
                "The symptoms of a virus will continue until the immune system prevents it from reproducing in your body.");

        recover_time.setText("How long does it take to recover?");
        recover_time_text.setText("Recovery from COVID-19 can be slow, health experts say, and there are varying reports of how long people with the virus feel sick.\n" +
                "\n" +
                "Lisa Maragakis, senior director of infection prevention at Johns Hopkins Medicine, says that in mild cases, it can take people one to two weeks to recover, while serious cases can take six weeks or more.\n" +
                "\n" +
                "Some people have reported feeling sick for 10 days or more. Other health experts say people are sick on average for seven days after symptoms begin.");

        stop_isolation.setText("When can you stop isolating at home?");
        stop_isolation_text.setText("The Centers for Disease Control and Prevention released two sets of guidelines for when people recovering at home can stop isolating, one based on testing and another based on the time since the onset of illness and recovery.\n" +
                "\n" +
                "The test-based guidelines say people can come out of isolation once they receive two negative COVID-19 test results taken at least 24 hours apart. People also must show improvements in other symptoms and no longer have a fever, without the use of fever-reducing medication.\n" +
                "\n" +
                "But because of the amount of time test results take to get back and the limited availability of them, following those guidelines may not be feasible.\n" +
                "\n" +
                "In Dallas County, for example, people can get tested at two drive-through centers only if they have a fever, coughing or shortness of breath. A person who has recovered from the virus would not be able to get tested there and probably would face a long wait for test results to come back elsewhere.\n" +
                "\n" +
                "Quest Diagnostics and LabCorp, for example, report a two- to four-day turnaround, but it can be longer depending on demand.\n" +
                "\n" +
                "The CDC's other guidelines, which are based on symptom onset, say people can end isolation after three consecutive days without a fever—without using fever-reducing medicine—and improvement in symptoms. Also, it needs to have been at least a week since the symptoms first appeared.\n" +
                "\n" +
                "However, the CDC notes that this second set of guidelines comes with some risk.\n" +
                "\n" +
                "\"This recommendation will prevent most but cannot prevent all instances of secondary spread,\" the CDC's website says. \"The risk of transmission after recovery is likely substantially less than that during illness; recovered persons will not be shedding large amounts of virus by this point if they are shedding at all. Certain employers can choose to apply more stringent criteria for certain returning workers where a higher threshold to prevent transmission is warranted.\"\n" +
                "\n" +
                "Some health experts recommend staying isolated for an additional three days after symptoms disappear, because traces of the virus may remain in the body even if a person doesn't feel sick.\n" +
                "\n" +
                "For people who test positive but don't show symptoms, the CDC says they can stop isolating after seven days from the test result, as long as they are still asymptomatic.");

        contagious_time.setText("How long are you contagious?");
        contagious_time_text.setText("Health experts don't know how long a person is contagious once they test positive for the virus.\n" +
                "\n" +
                "One study in Germany found that people were at a low risk of being contagious 10 days after they started feeling sick. Another study of people in China found that the virus could stay in the body for a week to 37 days. But the presence of the virus in the body doesn't necessarily mean a person is contagious.\n" +
                "\n" +
                "Some health experts say a good indicator of contagiousness is a fever because how contagious a person is generally declines as a fever does.\n" +
                "\n" +
                "Maragakis at Johns Hopkins Medicine said it's OK to return to normal activities as long as it has been a week since symptoms began, three days have passed without a fever and other symptoms are improving—the same guidelines the CDC recommends when testing isn't used as the deciding factor.\n" +
                "\n" +
                "But some health experts think the CDC guidelines for stopping self-isolation are too lenient.\n" +
                "\n" +
                "\"A lot of people I know are uncomfortable with that guidance,\" Aaron Carroll, a professor of medicine at Indiana University, told National Public Radio. \"They think that it may not be as conservative as it needs to be.\"\n" +
                "\n" +
                "Overall, health experts say more research is needed to know for sure how contagious someone is after testing positive—and for how long.");

        recovers_immune.setText("Is a person who recovers immune?");
        recovers_immune_text.setText("Generally, when you recover from a virus, your immune system has cells in the body that \"remember\" it, and antibodies help fight it off the next time it gets into your system, making you immune.\n" +
                "\n" +
                "But there's a lot that still isn't known about immunity to COVID-19. Doctors have found antibodies in patients who have recovered from the virus, but there are still some questions about how long that immunity may last.\n" +
                "\n" +
                "Immunity to some diseases can decrease over time, making you susceptible to getting sick in the future. And the coronavirus that causes the common cold doesn't provide long-lasting immunity. Health experts don't know whether the same is true with COVID-19.\n" +
                "\n" +
                "Some health experts have looked to two other known strains of coronavirus, SARS and MERS, for an indication of what immunity may look like.\n" +
                "\n" +
                "\"Based on immunity to SARS (and) MERS, and seasonal coronaviruses, a reasonable expectation is that most, and maybe nearly all, people who have been infected with ... (COVID-19) will have immunity for a year or more,\" Marc Lipsitch, an epidemiologist at the Harvard T.H. Chan School of Public Health, told NPR.\n" +
                "\n" +
                "He said the immunity would at least protect people against serious illness and from being highly contagious.");
    }

    public void recoveryTimePreviousBtnClick(View v) {
        Intent intent = new Intent(RecoverTime.this, Chapter1.class);
        startActivity(intent);
    }
}
