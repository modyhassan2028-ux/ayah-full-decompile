package J5;

import com.ayah.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 J5.b[], still in use, count: 1, list:
  (r3v4 J5.b[]) from 0x003d: CONSTRUCTOR (r3v4 J5.b[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:62) call: r9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    ARABIC("ar", R.string.arabic_category, 1, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ENGLISH("en", R.string.english_category, 3, 1),
    /* JADX INFO: Fake field, exist only in values array */
    REGULAR("quran-hafs", R.string.hafs_category, 2, 3);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p179r9.b f4335w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4339u;

    static {
        f4335w = new p179r9.b(bVarArr);
    }

    public b(String str, int i10, int i11, int i12) {
        super(str, i);
        this.f4336r = str;
        this.f4337s = i10;
        this.f4338t = i11;
        this.f4339u = i12;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4334v.clone();
    }
}
