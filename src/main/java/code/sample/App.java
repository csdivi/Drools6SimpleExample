package code.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class App 
{
    public static void main( String[] args )
    {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession");

        List<Applicant> list = new ArrayList<Applicant>();
        list.add(new Applicant("one", 1, true));
        list.add(new Applicant("two", 2, true));
        list.add(new Applicant("three", 3, true));
        list.add(new Applicant("twenty", 20, true));
        list.add(new Applicant("thirty", 30, true));

        for (Applicant applicant : list) {
            kSession.insert(applicant);
        }

        System.out.println(kSession.fireAllRules());

        for (Applicant applicant : list) {
            System.out.println(applicant);
        }

    }
}
