package p035d3;

import j$.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import p110k9.a;
import p110k9.y;
import p125m4.b;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: renamed from: d3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0924f extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f15607r;

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        C0924f c0924f = new C0924f(2, cVar);
        c0924f.f15607r = ((Boolean) obj).booleanValue();
        return c0924f;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C0924f c0924f = (C0924f) create(bool, (c) obj2);
        y yVar = y.f19095a;
        c0924f.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        boolean z10 = this.f15607r;
        a.e(obj);
        b.f19617d.set(z10);
        Locale localeForLanguageTag = z10 ? Locale.forLanguageTag("ar-EG") : Locale.getDefault();
        String language = localeForLanguageTag.getLanguage();
        if (!language.equals(b.f19614a)) {
            b.f19614a = language;
            b.f19615b = NumberFormat.getNumberInstance(localeForLanguageTag);
            b.f19616c = DateTimeFormatter.ofPattern("hh:mm a", localeForLanguageTag);
        }
        return y.f19095a;
    }
}
