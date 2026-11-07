package p125m4;

import android.content.res.Resources;
import j$.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f19614a = Locale.getDefault().getLanguage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static NumberFormat f19615b = NumberFormat.getIntegerInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static DateTimeFormatter f19616c = DateTimeFormatter.ofPattern("hh:mm a");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f19617d = new AtomicBoolean(false);

    public static Locale a() {
        return b() ? Locale.forLanguageTag("ar-EG") : Locale.getDefault();
    }

    public static boolean b() {
        return f19617d.get() || "ar".equals(Resources.getSystem().getConfiguration().locale.getLanguage());
    }
}
