package com.example.coronavirus_howlongdoesittaketorecover;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class AboutCoronavirus extends Activity {
    TextView overview,
            about_corona_text_1,
            about_corona_text_2,
            about_corona_text_3,
            about_corona_text_4,
            about_corona_text_5,
            prevention,
            about_corona_prevention_1,
            about_corona_prevention_2,
            symptoms,
            about_corona_symptoms_1,
            about_corona_symptoms_2,
            about_corona_symptoms_3,
            about_corona_symptoms_4,
            about_corona_symptoms_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_coronavirus);

        overview = (TextView) findViewById(R.id.about_corona_overview);
        about_corona_text_1 = (TextView) findViewById(R.id.about_corona_text_1);
        about_corona_text_2 = (TextView) findViewById(R.id.about_corona_text_2);
        about_corona_text_3 = (TextView) findViewById(R.id.about_corona_text_3);
        about_corona_text_4 = (TextView) findViewById(R.id.about_corona_text_4);
        about_corona_text_5 = (TextView) findViewById(R.id.about_corona_text_5);

        prevention = (TextView) findViewById(R.id.about_corona_prevention);
        about_corona_prevention_1 = (TextView) findViewById(R.id.about_corona_prevention_1);
        about_corona_prevention_2 = (TextView) findViewById(R.id.about_corona_prevention_2);

        symptoms = (TextView) findViewById(R.id.about_corona_symptoms);
        about_corona_symptoms_1 = (TextView) findViewById(R.id.about_corona_symptoms_1);
        about_corona_symptoms_2 = (TextView) findViewById(R.id.about_corona_symptoms_2);
        about_corona_symptoms_3 = (TextView) findViewById(R.id.about_corona_symptoms_3);
        about_corona_symptoms_4 = (TextView) findViewById(R.id.about_corona_symptoms_4);
        about_corona_symptoms_5 = (TextView) findViewById(R.id.about_corona_symptoms_5);

//        overview.setText("Overview");
        overview.setText(Html.fromHtml("<span><u>Overview</u></span>"));
        about_corona_text_1.setText("Coronavirus disease (COVID-19) is an infectious disease caused by a newly discovered coronavirus.");
        about_corona_text_2.setText("Most people infected with the COVID-19 virus will experience mild to moderate respiratory illness and recover without requiring special treatment.  Older people, and those with underlying medical problems like cardiovascular disease, diabetes, chronic respiratory disease, and cancer are more likely to develop serious illness.");
        about_corona_text_3.setText("The best way to prevent and slow down transmission is be well informed about the COVID-19 virus, the disease it causes and how it spreads. Protect yourself and others from infection by washing your hands or using an alcohol based rub frequently and not touching your face. ");
        about_corona_text_4.setText("The COVID-19 virus spreads primarily through droplets of saliva or discharge from the nose when an infected person coughs or sneezes, so it’s important that you also practice respiratory etiquette (for example, by coughing into a flexed elbow).");
        about_corona_text_5.setText("At this time, there are no specific vaccines or treatments for COVID-19. However, there are many ongoing clinical trials evaluating potential treatments. WHO will continue to provide updated information as soon as clinical findings become available.");

//        prevention.setText("Prevention");
        prevention.setText(Html.fromHtml("<span><u>Prevention</u></span>"));
        about_corona_prevention_1.setText("To prevent infection and to slow transmission of COVID-19, do the following:");
        about_corona_prevention_2.setText("1. Wash your hands regularly with soap and water, or clean them with alcohol-based hand rub.\n\n" +
                "2. Maintain at least 1 metre distance between you and people coughing or sneezing.\n\n" +
                "3. Avoid touching your face.\n\n" +
                "4. Cover your mouth and nose when coughing or sneezing.\n\n" +
                "5. Stay home if you feel unwell.\n\n" +
                "6. Refrain from smoking and other activities that weaken the lungs.\n\n" +
                "7. Practice physical distancing by avoiding unnecessary travel and staying away from large groups of people.");

        symptoms.setText(Html.fromHtml("<span><u>Symptoms</u></span>"));
        about_corona_symptoms_1.setText("COVID-19 affects different people in different ways. Most infected people will develop mild to moderate illness and recover without hospitalization.");
        about_corona_symptoms_2.setText("Most common symptoms:\n" +
                "1. fever.\n" +
                "2. dry cough.\n" +
                "3. tiredness.");
        about_corona_symptoms_3.setText("Less common symptoms:\n" +
                "1. aches and pains.\n" +
                "2. sore throat.\n" +
                "3. diarrhoea.\n" +
                "4. conjunctivitis.\n" +
                "5. headache.\n" +
                "6. loss of taste or smell.\n" +
                "7. a rash on skin, or discolouration of fingers or toes.");
        about_corona_symptoms_4.setText("Serious symptoms:\n" +
                "1. difficulty breathing or shortness of breath.\n" +
                "2. chest pain or pressure.\n" +
                "3. loss of speech or movement.");
        about_corona_symptoms_5.setText("Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. \n\n" +
                "People with mild symptoms who are otherwise healthy should manage their symptoms at home. \n\n" +
                "On average it takes 5–6 days from when someone is infected with the virus for symptoms to show, however it can take up to 14 days. ");
    }

    public void aboutCoronaPreviousBtnClick(View v) {
        Intent intent = new Intent(AboutCoronavirus.this, Chapter1.class);
        startActivity(intent);
    }
}
