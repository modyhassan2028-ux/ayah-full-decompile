package J8;

import U6.C0532j;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4410b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4411c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f4412d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0532j f4413a;

    public k(C0532j c0532j) {
        this.f4413a = c0532j;
    }

    public final boolean a(K8.b bVar) {
        if (TextUtils.isEmpty(bVar.f5309c)) {
            return true;
        }
        long j = bVar.f5312f + bVar.f5311e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4413a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f4410b;
    }
}
