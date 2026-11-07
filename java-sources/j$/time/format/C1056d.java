package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1056d implements InterfaceC1057e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1057e[] f17867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17868b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1056d(List list, boolean z10) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC1057e[]) arrayList.toArray(new InterfaceC1057e[arrayList.size()]), z10);
    }

    public C1056d(InterfaceC1057e[] interfaceC1057eArr, boolean z10) {
        this.f17867a = interfaceC1057eArr;
        this.f17868b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.f17930c--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // j$.time.format.InterfaceC1057e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(j$.time.format.y r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.f17868b
            if (r2 == 0) goto Le
            int r3 = r8.f17930c
            int r3 = r3 + r1
            r8.f17930c = r3
        Le:
            j$.time.format.e[] r3 = r7.f17867a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.k(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.f17930c
            int r9 = r9 - r1
            r8.f17930c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.f17930c
            int r0 = r0 - r1
            r8.f17930c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C1056d.k(j$.time.format.y, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = this.f17868b;
        InterfaceC1057e[] interfaceC1057eArr = this.f17867a;
        int i11 = 0;
        if (z10) {
            ArrayList arrayList = vVar.f17922d;
            D dC = vVar.c();
            dC.getClass();
            D d5 = new D();
            ((HashMap) d5.f17841a).putAll(dC.f17841a);
            d5.f17842b = dC.f17842b;
            d5.f17843c = dC.f17843c;
            d5.f17844d = dC.f17844d;
            arrayList.add(d5);
            int length = interfaceC1057eArr.length;
            int iL = i10;
            while (i11 < length) {
                iL = interfaceC1057eArr[i11].l(vVar, charSequence, iL);
                if (iL < 0) {
                    ArrayList arrayList2 = vVar.f17922d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i10;
                }
                i11++;
            }
            ArrayList arrayList3 = vVar.f17922d;
            arrayList3.remove(arrayList3.size() - 2);
            return iL;
        }
        int length2 = interfaceC1057eArr.length;
        while (i11 < length2) {
            i10 = interfaceC1057eArr[i11].l(vVar, charSequence, i10);
            if (i10 < 0) {
                return i10;
            }
            i11++;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC1057e[] interfaceC1057eArr = this.f17867a;
        if (interfaceC1057eArr != null) {
            boolean z10 = this.f17868b;
            sb.append(z10 ? "[" : "(");
            for (InterfaceC1057e interfaceC1057e : interfaceC1057eArr) {
                sb.append(interfaceC1057e);
            }
            sb.append(z10 ? "]" : ")");
        }
        return sb.toString();
    }
}
