package X;

import K9.InterfaceC0402u;
import K9.c0;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import Z.C0673b0;
import Z.C0691k0;
import Z.T;
import Z.X;
import Z.r0;
import com.ayah.MainActivity;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p056f2.AbstractC0939l;
import p151p.C1256n;
import p207v2.AbstractC1379q;
import p207v2.e0;
import p223x.q0;

/* JADX INFO: renamed from: X.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641m extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f9758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f9759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9760v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0641m(c0 c0Var, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f9756r = 9;
        this.f9759u = c0Var;
        this.f9760v = (q9.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r1v12, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v18, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r1v22, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f9756r) {
            case 0:
                C0641m c0641m = new C0641m((p241y9.a) this.f9759u, (p241y9.e) this.f9760v, cVar, 0);
                c0641m.f9758t = obj;
                return c0641m;
            case 1:
                C0641m c0641m2 = new C0641m((p241y9.f) this.f9759u, (s) this.f9760v, cVar, 1);
                c0641m2.f9758t = obj;
                return c0641m2;
            case 2:
                C0641m c0641m3 = new C0641m((p241y9.g) this.f9759u, (s) this.f9760v, cVar, 2);
                c0641m3.f9758t = obj;
                return c0641m3;
            case 3:
                C0641m c0641m4 = new C0641m((r0) this.f9759u, (T) this.f9760v, cVar, 3);
                c0641m4.f9758t = obj;
                return c0641m4;
            case 4:
                C0641m c0641m5 = new C0641m((p150o9.h) this.f9759u, (InterfaceC0415h) this.f9760v, cVar, 4);
                c0641m5.f9758t = obj;
                return c0641m5;
            case 5:
                return new C0641m((MainActivity) this.f9758t, (z3.k) this.f9759u, (z3.k) this.f9760v, cVar, 5);
            case 6:
                return new C0641m((X) this.f9759u, (TodayPage) this.f9760v, cVar, 6);
            case 7:
                return new C0641m((p223x.X) this.f9758t, (X) this.f9759u, (C0673b0) this.f9760v, cVar, 7);
            case 8:
                return new C0641m((p190t4.e) this.f9758t, (p052ea.b) this.f9759u, (p241y9.c) this.f9760v, cVar, 8);
            case 9:
                C0641m c0641m6 = new C0641m((c0) this.f9759u, (p241y9.e) this.f9760v, cVar);
                c0641m6.f9758t = obj;
                return c0641m6;
            case 10:
                C0641m c0641m7 = new C0641m((InterfaceC0415h) this.f9759u, (L3.f) this.f9760v, cVar, 10);
                c0641m7.f9758t = obj;
                return c0641m7;
            case 11:
                C0641m c0641m8 = new C0641m((p241y9.f) this.f9759u, (E5.e) this.f9760v, cVar);
                c0641m8.f9758t = obj;
                return c0641m8;
            case 12:
                C0641m c0641m9 = new C0641m((InterfaceC0415h) this.f9759u, (p241y9.f) this.f9760v, cVar);
                c0641m9.f9758t = obj;
                return c0641m9;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0641m c0641m10 = new C0641m((M9.e) this.f9759u, (p207v2.G) this.f9760v, cVar, 13);
                c0641m10.f9758t = obj;
                return c0641m10;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new C0641m((AbstractC1379q) this.f9758t, (p217w2.a) this.f9759u, (p207v2.N) this.f9760v, cVar, 14);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                C0641m c0641m11 = new C0641m((M9.e) this.f9759u, (p241y9.e) this.f9760v, cVar);
                c0641m11.f9758t = obj;
                return c0641m11;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                C0641m c0641m12 = new C0641m((C1256n) this.f9759u, (p241y9.c) this.f9760v, cVar, 16);
                c0641m12.f9758t = obj;
                return c0641m12;
            case 17:
                C0641m c0641m13 = new C0641m((q0) this.f9759u, (X) this.f9760v, cVar, 17);
                c0641m13.f9758t = obj;
                return c0641m13;
            case 18:
                return new C0641m((p218w3.c) this.f9759u, (BookmarkType) this.f9760v, cVar, 18);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new C0641m((AbstractC0939l) this.f9760v, cVar);
            default:
                return new C0641m((B.j) this.f9758t, (B.i) this.f9759u, (K9.J) this.f9760v, cVar, 20);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9756r) {
            case 0:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0641m) create((F) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((C0641m) create((p110k9.j) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((C0641m) create((C0691k0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 5:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 8:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 9:
                return ((C0641m) create((e0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 10:
                return ((C0641m) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 11:
                return ((C0641m) create(obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 12:
                return ((C0641m) create((e0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 17:
                return ((C0641m) create((C0691k0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 18:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((C0641m) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x027f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0381  */
    /* JADX WARN: Code duplicated, block: B:189:0x0385  */
    /* JADX WARN: Code duplicated, block: B:191:0x0397  */
    /* JADX WARN: Code duplicated, block: B:194:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:203:0x0403  */
    /* JADX WARN: Code duplicated, block: B:209:0x0418 A[LOOP:0: B:207:0x0412->B:209:0x0418, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0279, code lost:
    
        if (p217w2.a.a(r0, r1, r2, r3, true, r4, r6, r7, r15) == r11) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b7, code lost:
    
        if (r10 == r11) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03be, code lost:
    
        if (r10 == r11) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v84, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r2v43, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r2v46, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r4v10, types: [q9.i, y9.f] */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0641m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0641m(M9.e eVar, p241y9.e eVar2, p150o9.c cVar) {
        super(2, cVar);
        this.f9756r = 15;
        this.f9759u = eVar;
        this.f9760v = (q9.i) eVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0641m(InterfaceC0415h interfaceC0415h, p241y9.f fVar, p150o9.c cVar) {
        super(2, cVar);
        this.f9756r = 12;
        this.f9759u = interfaceC0415h;
        this.f9760v = (q9.i) fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641m(AbstractC0939l abstractC0939l, p150o9.c cVar) {
        super(2, cVar);
        this.f9756r = 19;
        this.f9760v = abstractC0939l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0641m(Object obj, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f9756r = i10;
        this.f9758t = obj;
        this.f9759u = obj2;
        this.f9760v = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0641m(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f9756r = i10;
        this.f9759u = obj;
        this.f9760v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0641m(p241y9.f fVar, E5.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f9756r = 11;
        this.f9759u = (q9.i) fVar;
        this.f9760v = eVar;
    }
}
