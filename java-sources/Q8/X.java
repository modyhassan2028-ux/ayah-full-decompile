package Q8;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f6930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f6931b;

    public X(k0 k0Var, l0 l0Var) {
        p251z9.j.e(k0Var, "timeProvider");
        p251z9.j.e(l0Var, "uuidGenerator");
        this.f6930a = k0Var;
        this.f6931b = l0Var;
    }

    public final P a(P p10) {
        String str;
        this.f6931b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        p251z9.j.d(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        p251z9.j.d(string, "toString(...)");
        String lowerCase = H9.v.P0(string, "-", "").toLowerCase(Locale.ROOT);
        p251z9.j.d(lowerCase, "toLowerCase(...)");
        return new P(p10 != null ? p10.f6908c + 1 : 0, this.f6930a.a().f7030b, lowerCase, (p10 == null || (str = p10.f6907b) == null) ? lowerCase : str);
    }
}
