package p029c8;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13548c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f13546a = obj;
        this.f13547b = obj2;
        this.f13548c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f13546a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f13547b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f13548c);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
