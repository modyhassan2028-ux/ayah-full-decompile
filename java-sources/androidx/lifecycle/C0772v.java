package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0772v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0767p f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0769s f12669b;

    public final void a(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        EnumC0767p enumC0767pA = enumC0766o.a();
        EnumC0767p enumC0767p = this.f12668a;
        p251z9.j.e(enumC0767p, "state1");
        if (enumC0767pA.compareTo(enumC0767p) < 0) {
            enumC0767p = enumC0767pA;
        }
        this.f12668a = enumC0767p;
        this.f12669b.n(interfaceC0771u, enumC0766o);
        this.f12668a = enumC0767pA;
    }
}
