package O8;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6509b;

    public b(Set set, c cVar) {
        this.f6508a = a(set);
        this.f6509b = cVar;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f6506a);
            sb.append('/');
            sb.append(aVar.f6507b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
