package com.example.coronavirus_howlongdoesittaketorecover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Recover extends Activity {
    TextView recovery_text_1,
            recovery_details_1,
            mild_symptoms,
            mild_symptoms_text,
            serious_symptoms,
            serious_symptoms_text,
            intensive_care,
            intensive_care_text,
            health_long_term,
            health_long_term_text,
            people_recovered,
            people_recovered_text,
            Covid_19_again,
            Covid_19_again_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);

        recovery_text_1 = (TextView) findViewById(R.id.recovery_text_1);
        recovery_details_1 = (TextView) findViewById(R.id.recovery_details_1);

        mild_symptoms = (TextView) findViewById(R.id.mild_symptoms);
        mild_symptoms_text = (TextView) findViewById(R.id.mild_symptoms_text);

        serious_symptoms = (TextView) findViewById(R.id.serious_symptoms);
        serious_symptoms_text = (TextView) findViewById(R.id.serious_symptoms_text);

        intensive_care = (TextView) findViewById(R.id.intensive_care);
        intensive_care_text = (TextView) findViewById(R.id.intensive_care_text);

        health_long_term = (TextView) findViewById(R.id.health_long_term);
        health_long_term_text = (TextView) findViewById(R.id.health_long_term_text);

        people_recovered = (TextView) findViewById(R.id.people_recovered);
        people_recovered_text = (TextView) findViewById(R.id.people_recovered_text);

        Covid_19_again = (TextView) findViewById(R.id.Covid_19_again);
        Covid_19_again_text = (TextView) findViewById(R.id.Covid_19_again_text);

        recovery_text_1.setText("Coronavirus: How long does it take to recover?");
        recovery_details_1.setText("More than one million people around the world are known to have recovered from coronavirus, according to Johns Hopkins University. But the road back to full health is not the same for everyone.\n" +
                "\n" +
                "Recovery time will depend on how sick you became in the first place. Some people will shrug off the illness quickly, but for others it could leave lasting problems.\n" +
                "\n" +
                "Age, gender and other health issues all increase the risk of becoming more seriously ill from Covid-19.\n" +
                "\n" +
                "** Are ethnic minorities being hit hardest by coronavirus?\n" +
                "** How does coronavirus affect children?\n" +
                "** Coronavirus: What is the risk to men over 50?\n" +
                "The more invasive the treatment you receive, and the longer it is performed, the longer recovery is likely to take.");


        mild_symptoms.setText("What if I have only mild symptoms?");
        mild_symptoms_text.setText("Most people who get Covid-19 will develop only the main symptoms - a cough or fever. But they could experience body aches, fatigue, sore throat and headache.\n" +
                "\n" +
                "The cough is initially dry, but some people will eventually start coughing up mucus containing dead lung cells killed by the virus.\n" +
                "\n" +
                "These symptoms are treated with bed rest, plenty of fluids and pain relief such as paracetamol.\n" +
                "People with mild symptoms should make a good and speedy recovery.\n" +
                "\n" +
                "The fever should settle in less than a week, although the cough may linger. A World Health Organization (WHO) analysis of Chinese data says it takes two weeks on average to recover.");

        serious_symptoms.setText("What if I have more serious symptoms?");
        serious_symptoms_text.setText("The disease can become much more serious for some. This tends to happen about seven to 10 days into the infection.\n" +
                "\n" +
                "The transformation can be sudden. Breathing becomes difficult and the lungs get inflamed. This is because although the body's immune system is trying to fight back - it's actually overreacting and the body experiences collateral damage.\n" +
                "\n" +
                "Some people will need to be in hospital for oxygen therapy.\n" +
                "\n" +
                "GP Sarah Jarvis says: \"The shortness of breath may take some considerable time to improve... the body is getting over scarring and inflammation.\"\n" +
                "\n" +
                "She says it could take two to eight weeks to recover, with tiredness lingering.");

        intensive_care.setText("What if I need intensive care?");
        intensive_care_text.setText("The WHO estimates one person in 20 will need intensive care treatment, which can include being sedated and put on a ventilator.\n" +
                "\n" +
                "It will take time to recover from any spell in an intensive or critical care unit (ICU), no matter what the illness. Patients are moved to a regular ward before going home.\n" +
                "\n" +
                "Dr Alison Pittard, Dean of the Faculty of Intensive Care Medicine, says it can take 12 to 18 months to get back to normal after any spell in critical care.\n" +
                "\n" +
                "Spending a long time in a hospital bed leads to muscle mass loss. Patients will be weak and muscle will take time to build up again. Some people will need physiotherapy to walk again.\n" +
                "Because of what the body goes through in ICU, there's also the possibility of delirium and psychological disorders.\n" +
                "\n" +
                "\"There does seem to be an added element with this disease - viral fatigue is definitely a huge factor,\" says Paul Twose, critical care physiotherapist at Cardiff and Vale University Health Board.\n" +
                "\n" +
                "There have been reports from China and Italy of whole-body weakness, shortness of breath after any level of exertion, persistent coughing and irregular breathing. Plus needing a lot of sleep.\n" +
                "\n" +
                "\"We do know patients take a considerable period, potentially months, to recover.\"\n" +
                "\n" +
                "But it is hard to generalise. Some people spend relatively short periods in critical care, while others are ventilated for weeks.");

        health_long_term.setText("Will coronavirus affect my health long-term?");
        health_long_term_text.setText("We don't know for sure as there is no long-term data, but we can look at other conditions.\n" +
                "\n" +
                "Acute respiratory distress syndrome (called Ards) develops in patients whose immune systems go into overdrive, causing damage to the lungs.\n" +
                "\n" +
                "\"There is really good data that, even five years down the line, people can have ongoing physical and psychological difficulties,\" says Mr Twose.\n" +
                "\n" +
                "Dr James Gill, a GP and lecturer at Warwick Medical School, says people also need mental health support to improve recovery.\n" +
                "\n" +
                "\"You're finding breathing difficult, then the doctor says 'We need to put you on a ventilator. We need to put you to sleep. Do you want to say goodbye to your family?'.\n" +
                "\n" +
                "\"PTSD [post-traumatic stress disorder] in these most severe patients is not unsurprising. There will be significant psychological scars for many.\"\n" +
                "\n" +
                "There remains the possibility that even some mild cases may leave patients with long-term health problems - such as fatigue.");

        people_recovered.setText("How many people have recovered?");
        people_recovered_text.setText("Getting an accurate figure is difficult.\n" +
                "\n" +
                "As of 1 May, Johns Hopkins University reported more than 1,021,000 people had recovered out of 3.2 million people known to have been infected around the world.\n" +
                "But countries use different recording methods. Some are not publishing recovery figures and many mild infections will be missed.\n" +
                "\n" +
                "Mathematical models have estimated between 99-99.5% of people recover.");

        Covid_19_again.setText("Can I catch Covid-19 again?");
        Covid_19_again_text.setText("There has been much speculation, but little evidence, on how durable any immunity is. If patients have successfully fought off the virus, they must have built up an immune response.\n" +
                "\n" +
                "Reports of patients being infected twice may just be down to tests incorrectly recording they were free of the virus.\n" +
                "\n" +
                "The immunity question is vital for understanding whether people can be reinfected and how effective any vaccine may be.");
    }

    public void recoverPreviousBtnClick(View v) {
        Intent intent = new Intent(Recover.this, Chapter1.class);
        startActivity(intent);
    }
}
