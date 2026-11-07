package p084i;

import E1.e;
import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static e b(Configuration configuration) {
        return e.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f1426a.a()));
    }

    public static void d(Configuration configuration, e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f1426a.a()));
    }
}
