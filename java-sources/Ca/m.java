package Ca;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f833f;
    public static final j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f834h;

    static {
        int i10 = 1;
        a aVar = new a(i10);
        int i11 = 2;
        j jVarA = c.a("Validity", new n[]{aVar, aVar}, new A3.d(4), new A3.d(6));
        b bVar = new b(i11, new A3.d(7));
        j jVar = c.g;
        jVar.getClass();
        j jVarA2 = c.a("AlgorithmIdentifier", new n[]{j.e(jVar, 0L, null, 63), bVar}, new A3.d(8), new A3.d(9));
        j jVar2 = c.f790a;
        Boolean bool = Boolean.FALSE;
        j jVarF = jVar2.f(bool);
        j jVar3 = c.f791b;
        f828a = c.a("BasicConstraints", new n[]{jVarF, jVar3.f(null)}, new A3.d(10), new A3.d(11));
        j jVarH = j.h(c.j, 2L);
        f829b = jVarH;
        j jVar4 = c.f794e;
        j jVarH2 = j.h(jVar4, 7L);
        f830c = jVarH2;
        a aVar2 = c.f800m;
        f831d = new b(i10, new n[]{jVarH, jVarH2, aVar2}).b(16L, "SEQUENCE OF");
        j jVarA3 = c.a("Extension", new n[]{j.e(jVar, 0L, null, 63), jVar2.f(bool), p245z2.a.p(new b(i11, new A3.d(12)), jVar4.f818b, jVar4.f819c, bool)}, new A3.d(13), new A3.d(14));
        j jVarB = p245z2.a.a(c.a("AttributeTypeAndValue", new n[]{jVar, new b(0, new p110k9.j[]{new p110k9.j(p251z9.w.a(String.class), c.f796h), new p110k9.j(p251z9.w.a(Void.class), c.f797i), new p110k9.j(p251z9.w.a(e.class), aVar2)})}, new A3.d(15), new A3.d(16)), "SET OF", 17L).b(16L, "SEQUENCE OF");
        f832e = jVarB;
        b bVar2 = new b(i10, new n[]{jVarB});
        j jVar5 = c.f793d;
        j jVarA4 = c.a("SubjectPublicKeyInfo", new n[]{jVarA2, jVar5}, new A3.d(17), new A3.d(18));
        f833f = jVarA4;
        j jVarA5 = c.a("TBSCertificate", new n[]{jVar3.g(0L).f(0L), c.f792c, jVarA2, bVar2, jVarA, bVar2, jVarA4, j.h(jVar5, 1L).f(null), j.e(jVar5, 2L, null, 121).f(null), jVarA3.b(16L, "SEQUENCE OF").g(3L).f(p120l9.r.f19440r)}, new A3.d(19), new A3.d(20));
        g = jVarA5;
        f834h = c.a("Certificate", new n[]{jVarA5, jVarA2, jVar5}, new A3.d(21), new A3.d(22));
        c.a("PrivateKeyInfo", new n[]{jVar3, jVarA2, jVar4}, new A3.d(23), new A3.d(5));
    }
}
