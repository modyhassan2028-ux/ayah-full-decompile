package E8;

import C8.g;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f1979a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f1979a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f1979a.format((Date) obj));
    }
}
