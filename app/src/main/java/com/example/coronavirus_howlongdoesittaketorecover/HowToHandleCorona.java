package com.example.coronavirus_howlongdoesittaketorecover;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HowToHandleCorona extends Activity {
    TextView dealing_with_coronavirus,
            dealing_with_coronavirus_text,
            how_to_deal_with_isolation,
            how_to_deal_with_isolation_text,
            for_students,
            for_students_text,
            for_parents,
            for_parents_text,
            for_financial_stress,
            for_financial_stress_text,
            for_healthcare_workers,
            for_healthcare_workers_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_handle_corona);

        dealing_with_coronavirus = (TextView) findViewById(R.id.dealing_with_coronavirus);
        dealing_with_coronavirus_text = (TextView) findViewById(R.id.dealing_with_coronavirus_text);

        how_to_deal_with_isolation = (TextView) findViewById(R.id.how_to_deal_with_isolation);
        how_to_deal_with_isolation_text = (TextView) findViewById(R.id.how_to_deal_with_isolation_text);

        for_students = (TextView) findViewById(R.id.for_students);
        for_students_text = (TextView) findViewById(R.id.for_students_text);

        for_parents = (TextView) findViewById(R.id.for_parents);
        for_parents_text = (TextView) findViewById(R.id.for_parents_text);

        for_financial_stress = (TextView) findViewById(R.id.for_financial_stress);
        for_financial_stress_text = (TextView) findViewById(R.id.for_financial_stress_text);

        for_healthcare_workers = (TextView) findViewById(R.id.for_healthcare_workers);
        for_healthcare_workers_text = (TextView) findViewById(R.id.for_healthcare_workers_text);

        dealing_with_coronavirus.setText("Dealing with Coronavirus");
        dealing_with_coronavirus_text.setText("There’s no way around it: the world is really scary right now. Now that Coronavirus is sweeping the globe as a pandemic, we’re all afraid for the health of ourselves and our loved ones. People all across the world are pinching pennies to make rent and support their families. Parents are forced to put their work (and potentially income) on hold to homeschool their kids… that is if their kid is even old enough for school. If not, then they suddenly need to provide 24/7 childcare while keeping up a job. And, everyone everywhere must stay away from social situations. It’s scary. And isolating. And lonely. Yet, we have the tools at our fingertips to help each other. Even in isolation, we’re still connected.");

        how_to_deal_with_isolation.setText("How to Deal with Isolation");
        how_to_deal_with_isolation_text.setText("Change is hard. This kind of rapid change is especially hard. In an effort to slow the spread of Coronavirus (COVID-19), schools have closed for the year and businesses have shuttered indefinitely. Health officials are imploring the public to stay home and cancel any in-person social interactions.\n" +
                "\n" +
                "Weddings? Proms? Coffee with friends? All canceled.\n" +
                "\n" +
                "A few things that aren’t canceled? Empathy. Kindness. Our faith in humanity.\n" +
                "\n" +
                "These mandatory closures in the interest of public health are causing massive disruptions in everyday life. And, while the first few days of isolation may feel like a welcome chance to lay low for a bit, here’s the reality: the news is scary, we’re in this for the long haul, and lack of human interaction can feel really freakin’ lonely.\n" +
                "\n" +
                "Here are some ways to prioritize your mental health if you’re feeling anxious and lonely:\n" +
                "\n" +
                "1. Reach out for help. Our Crisis Counselors are available to help you move from a hot moment to cool and calm totally free, 24/7. Our model has always leveraged kind, empathetic people with a wifi connection from the comfort of their own home. We’re here. We’re ready. We were made for this. And, most importantly, your feelings are valid. You deserve kindness. We’re here to help. Text HOME to 741741 to connect with a Crisis Counselor.\n" +
                "\n" +
                "2. Get some fresh air. Social distancing doesn’t mean you can’t go outside as long as you keep a distance from anyone who isn’t part of your family. Go for a walk! Take a hike! Do some outdoor yoga! The natural world is your oyster. Dive in.\n" +
                "\n" +
                "3. Prioritize mental check-ins. Now is the time to pick up meditation, start journaling, or tap into some mindfulness techniques. We love this grounding technique. Or, you can tune into Lizzo’s meditation Instagram Live. That works, too.\n" +
                "\n" +
                "4. Connect. Skip the scrolling and make your time online intentional. If you’re used to working in an office and are suddenly working from home full-time, chances are you’re missing one of the best parts of work—friends. Instead of diving right into virtual meetings, spend some time catching up and checking in on each other. Schedule virtual hangouts with your pals. Take your usual lunchtime and get on a group FaceTime. Or, if you’re still in school and studying from home, set up a virtual study session to cheer each other on as you go.\n" +
                "\n" +
                "5. Turn off those notifications. When you’re stuck at home all day in times like these, it can be easy to get sucked into an endless hole of news updates. Schedule a few dedicated times throughout the day to check in with the news and get the most important updates. No need for the minute-by-minute play-by-play of COVID-19 happenings to make you spiral.");

        for_students.setText("For Students");
        for_students_text.setText("Even if school every day can be the worst, finding out it’s canceled for the rest of the year is an entirely different story. That means no more learning, seeing friends, or special traditions like prom or graduation. There’s no sugar coating it—that sucks. Here are a few tips to cope with the disappointment.\n" +
                "\n" +
                "1. Stay on track. The best you can keep up with your learning. Not only is focusing on school a great break from focusing on what’s going on in the world, it’s also a way to progress in your life while everything else seems like it’s on pause.\n" +
                "\n" +
                "2. Stick to a schedule. Get up. Get dressed. Take a shower. Feed yourself. Sounds basic, but it will make a world of difference.\n" +
                "\n" +
                "3. Make sure you have what you need. A lot of students rely on school for many of their meals. If you normally participate in a free or reduced lunch program, make sure to check in with your school administrators to make sure you can still get food during this time.\n" +
                "\n" +
                "4. Put the social in social media. Forget posting for likes or making the best content. Use social media to connect with the people you miss seeing every day.\n" +
                "\n" +
                "5. Text it out. We get it, all of this is super overwhelming. We’re here to listen. Text HOME to 741741 to reach a Crisis Counselor.");

        for_parents.setText("For Parents");
        for_parents_text.setText("School closures have really thrown a wrench in everyone’s lives. Many parents rely on schools and daycare so that they can get to work to support their families. With kids stuck at home, many parents are forced to homeschool their kids while also keeping up with work remotely. Nothing about it is easy—in fact, it’s really hard shit. Here are a few ways to keep your mental health in check.\n" +
                "\n" +
                "1. Stick to a routine. This one can be hard considering everything about your routine has been flipped on its head… Still, maintaining some sort of schedule can be helpful to create a bit of normalcy in this unexpected and anxiety-inducing situation.\n" +
                "\n" +
                "2. Collaborate. If you have a partner who is also working from home, try alternating shifts of who is looking after the kids. And, communicate your needs to your team! Everyone has to be a little flexible right now—even your coworker who needs to pivot so you can take care of your family.\n" +
                "\n" +
                "3. Flexibility. Parents need time to focus on themselves too, so scrap those electronics limits!\n" +
                "\n" +
                "4. Be kind. Seems simple, but for real: you deserve kindness. From yourself. From your family. From your kids. From your coworkers. You’re doing the best you can. We’re here to talk about it if you need to vent. Text HOME to 741741 to connect with a Crisis Counselor.");

        for_financial_stress.setText("For Financial Stress");
        for_financial_stress_text.setText("In many ways, the rapid change to the economy is just as scary for a lot of folks as COVID-19 itself. Layoffs are happening immediately, freelancers aren’t able to book jobs, and for most of the country that already lived paycheck to paycheck, the loss of work is detrimental. This change can drum up anxiety about how to stay safe and healthy while also supporting your family. We hear you. It’s hard. You deserve to grieve. It’s okay to be scared. We can’t make it better, but we can listen. Text HOME to 741741 to reach a Crisis Counselor or message us on Facebook.");

        for_healthcare_workers.setText("For Financial Stress");
        for_healthcare_workers_text.setText("Healthcare workers, you’re heroes. Truly. The impending pressure on the healthcare industry means that you’ll be working harder, faster, and smarter to save as many lives as possible. And, you’ll do it all understanding the great risk to your own health. It’s understandable to be overwhelmed by this. You matter. Your life matters. We can’t make everyone healthy, but we can support you. If you’re on the front lines and need mental health support text HOME to 741741 to reach a Crisis Counselor. We know you have our back. Having yours is the least we can do.");
    }

    public void handleCoronaPreviousBtnClick(View v) {
        Intent intent = new Intent(HowToHandleCorona.this, Chapter1.class);
        startActivity(intent);
    }
}
