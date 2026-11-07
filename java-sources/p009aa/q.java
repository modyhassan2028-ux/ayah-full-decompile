package p009aa;

import p179r9.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 aa.q[], still in use, count: 1, list:
  (r4v3 aa.q[]) from 0x003f: CONSTRUCTOR (r4v3 aa.q[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:64) call: r9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b f11276y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final char f11277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final char f11278s;

    static {
        f11276y = new b(qVarArr);
    }

    public q(char c10, char c11) {
        super(str, i);
        this.f11277r = c10;
        this.f11278s = c11;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11275x.clone();
    }
}
