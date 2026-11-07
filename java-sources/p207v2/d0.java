package p207v2;

import B.g;
import B.h;
import B.j;
import K9.InterfaceC0402u;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import p085i0.n;
import p110k9.y;
import p150o9.c;
import p217w2.b;
import p219w4.f;
import p236y3.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f23225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f23226u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(M9.e eVar, e eVar2, c cVar) {
        super(2, cVar);
        this.f23223r = 0;
        this.f23225t = eVar;
        this.f23226u = (i) eVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q9.i, y9.e] */
    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23223r) {
            case 0:
                return new d0((M9.e) this.f23225t, (e) this.f23226u, cVar);
            case 1:
                d0 d0Var = new d0((b) this.f23226u, cVar, 1);
                d0Var.f23225t = obj;
                return d0Var;
            case 2:
                return new d0((p218w3.c) this.f23225t, (BookmarkType) this.f23226u, cVar, 2);
            case 3:
                d0 d0Var2 = new d0((f) this.f23226u, cVar, 3);
                d0Var2.f23225t = obj;
                return d0Var2;
            case 4:
                return new d0((j) this.f23225t, (g) this.f23226u, cVar, 4);
            case 5:
                return new d0((j) this.f23225t, (h) this.f23226u, cVar, 5);
            case 6:
                return new d0((a) this.f23226u, cVar, 6);
            case 7:
                return new d0((a) this.f23225t, (String) this.f23226u, cVar, 7);
            case 8:
                return new d0((n) this.f23226u, cVar, 8);
            default:
                return new d0((p250z8.a) this.f23225t, (p241y9.c) this.f23226u, cVar, 9);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23223r) {
            case 0:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((d0) create((N) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 2:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 3:
                return ((d0) create((p199u4.a) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 4:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 5:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 6:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 7:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 8:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((d0) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r10 == r7) goto L58;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [q9.i, y9.e] */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p207v2.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, c cVar, int i10) {
        super(2, cVar);
        this.f23223r = i10;
        this.f23225t = obj;
        this.f23226u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, c cVar, int i10) {
        super(2, cVar);
        this.f23223r = i10;
        this.f23226u = obj;
    }
}
