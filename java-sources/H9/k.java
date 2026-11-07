package H9;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f3639d;

    public k(Matcher matcher, CharSequence charSequence) {
        p251z9.j.e(charSequence, "input");
        this.f3636a = matcher;
        this.f3637b = charSequence;
        this.f3638c = new j(0, this);
    }

    public final E9.d a() {
        Matcher matcher = this.f3636a;
        return B0.c.i0(matcher.start(), matcher.end());
    }

    public final k b() {
        Matcher matcher = this.f3636a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f3637b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        p251z9.j.d(matcher2, "matcher(...)");
        return p000a.a.e(matcher2, iEnd, charSequence);
    }
}
