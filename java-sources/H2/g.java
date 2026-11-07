package H2;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Q2.a, S9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q2.a f3270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S9.a f3271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p150o9.h f3272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Throwable f3273u;

    public g(Q2.a aVar) {
        S9.c cVarA = S9.d.a();
        p251z9.j.e(aVar, "delegate");
        this.f3270r = aVar;
        this.f3271s = cVarA;
    }

    @Override // Q2.a
    public final Q2.c a0(String str) {
        p251z9.j.e(str, "sql");
        return this.f3270r.a0(str);
    }

    @Override // S9.a
    public final void b(Object obj) {
        this.f3271s.b(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f3270r.close();
    }

    @Override // S9.a
    public final Object e(p150o9.c cVar) {
        return this.f3271s.e(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    public final void i(StringBuilder sb) {
        ?? K3;
        if (this.f3272t == null && this.f3273u == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        p150o9.h hVar = this.f3272t;
        if (hVar != null) {
            sb.append("\t\tCoroutine: " + hVar);
            sb.append('\n');
        }
        Throwable th = this.f3273u;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            p251z9.j.d(string, "toString(...)");
            H9.g gVar = new H9.g(string);
            boolean zHasNext = gVar.hasNext();
            ?? arrayList = p120l9.r.f19440r;
            if (zHasNext) {
                Object next = gVar.next();
                if (gVar.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    while (gVar.hasNext()) {
                        arrayList2.add(gVar.next());
                    }
                    K3 = arrayList2;
                } else {
                    K3 = AbstractC0813f2.K(next);
                }
            } else {
                K3 = arrayList;
            }
            int size = K3.size() - 1;
            if (size > 0) {
                if (size == 1) {
                    arrayList = AbstractC0813f2.K(p120l9.m.m0(K3));
                } else {
                    arrayList = new ArrayList(size);
                    if (K3 instanceof RandomAccess) {
                        int size2 = K3.size();
                        for (int i10 = 1; i10 < size2; i10++) {
                            arrayList.add(K3.get(i10));
                        }
                    } else {
                        ListIterator listIterator = K3.listIterator(1);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f3270r.toString();
    }
}
