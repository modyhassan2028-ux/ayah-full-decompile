package l0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f19328r = new k(2);

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        p pVar = (p) obj2;
        if (str.length() == 0) {
            return pVar.toString();
        }
        return str + ", " + pVar;
    }
}
