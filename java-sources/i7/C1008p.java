package i7;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: i7.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1008p extends C0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f17501u;

    @Override // i7.C0
    public final boolean p() {
        Calendar calendar = Calendar.getInstance();
        this.f17500t = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f17501u = sb.toString();
        return false;
    }

    public final long s() {
        q();
        return this.f17500t;
    }

    public final String t() {
        q();
        return this.f17501u;
    }
}
