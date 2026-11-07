package p013b2;

import Aa.a;
import java.nio.ByteBuffer;
import p023c2.b;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13196d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13199c = 0;

    public x(int i10, a aVar) {
        this.f13198b = aVar;
        this.f13197a = i10;
    }

    public final int a(int i10) {
        p023c2.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f3680u;
        int i11 = iA + aVarB.f3677r;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final p023c2.a b() {
        ThreadLocal threadLocal = f13196d;
        p023c2.a aVar = (p023c2.a) threadLocal.get();
        if (aVar == null) {
            aVar = new p023c2.a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f13198b.f554r;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f3677r;
            int i11 = (this.f13197a * 4) + ((ByteBuffer) bVar.f3680u).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f3680u).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f3680u;
            aVar.f3680u = byteBuffer;
            if (byteBuffer != null) {
                aVar.f3677r = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f3678s = i13;
                aVar.f3679t = ((ByteBuffer) aVar.f3680u).getShort(i13);
                return aVar;
            }
            aVar.f3677r = 0;
            aVar.f3678s = 0;
            aVar.f3679t = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        p023c2.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f3680u).getInt(iA + aVarB.f3677r) : 0));
        sb.append(", codepoints:");
        p023c2.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f3677r;
            i10 = ((ByteBuffer) aVarB2.f3680u).getInt(((ByteBuffer) aVarB2.f3680u).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
