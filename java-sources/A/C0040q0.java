package A;

import K9.C0395m;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import W.C0550d2;
import W.C0556f0;
import W.C0576l;
import com.ayah.feature.infolist.ui.wrapper.view.BaseListWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.ui.PreferencesFragment;
import com.ayah.ui.widget.search.SearchResultsView;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p151p.C1256n;
import p232y.C1466u;
import p232y.C1467v;
import p232y.C1471z;

/* JADX INFO: renamed from: A.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040q0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f391t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040q0(int i10, int i11, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f389r = i11;
        this.f390s = i10;
        this.f391t = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f389r) {
            case 0:
                return new C0040q0((C0045t0) this.f391t, cVar, 0);
            case 1:
                return new C0040q0((A2.a) this.f391t, cVar, 1);
            case 2:
                return new C0040q0((D0.O) this.f391t, cVar, 2);
            case 3:
                return new C0040q0((F2.K) this.f391t, cVar, 3);
            case 4:
                return new C0040q0((F4.d) this.f391t, cVar, 4);
            case 5:
                return new C0040q0((p124m3.d) this.f391t, this.f390s, cVar);
            case 6:
                return new C0040q0((Ga.A) this.f391t, cVar, 6);
            case 7:
                return new C0040q0((C0395m) this.f391t, cVar, 7);
            case 8:
                return new C0040q0((M.h) this.f391t, cVar, 8);
            case 9:
                return new C0040q0((K.X) this.f391t, cVar, 9);
            case 10:
                return new C0040q0((K4.d) this.f391t, cVar, 10);
            case 11:
                return new C0040q0((InterfaceC0415h) this.f391t, cVar, 11);
            case 12:
                return new C0040q0((BaseListWrapper) this.f391t, cVar, 12);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new C0040q0((C0556f0) this.f391t, cVar, 13);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new C0040q0((C0576l) this.f391t, cVar, 14);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new C0040q0((C0550d2) this.f391t, cVar, 15);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new C0040q0((KhatmahWrapper) this.f391t, cVar, 16);
            case 17:
                return new C0040q0(this.f390s, 17, (String) this.f391t, cVar);
            case 18:
                return new C0040q0((PreferencesFragment) this.f391t, cVar, 18);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new C0040q0(this.f390s, 19, (C1256n) this.f391t, cVar);
            case 20:
                return new C0040q0(this.f390s, 20, (p218w3.j) this.f391t, cVar);
            case 21:
                return new C0040q0((p223x.X) this.f391t, cVar, 21);
            case 22:
                return new C0040q0((C1466u) this.f391t, cVar, 22);
            case 23:
                return new C0040q0((C1467v) this.f391t, cVar, 23);
            case 24:
                return new C0040q0((C1471z) this.f391t, cVar, 24);
            case 25:
                return new C0040q0((p232y.Q) this.f391t, cVar, 25);
            case 26:
                return new C0040q0((p237y4.c) this.f391t, cVar, 26);
            case 27:
                return new C0040q0((SearchResultsView) this.f391t, cVar, 27);
            default:
                return new C0040q0((p250z8.a) this.f391t, cVar, 28);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f389r) {
            case 0:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 5:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 8:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 9:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 10:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 11:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 12:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 17:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 18:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 20:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 21:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 22:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 23:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 24:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 25:
                ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            case 26:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
            case 27:
                ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            default:
                return ((C0040q0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, p9.a] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0103 -> B:52:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011a -> B:62:0x011d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0040q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040q0(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f389r = i10;
        this.f391t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040q0(p124m3.d dVar, int i10, p150o9.c cVar) {
        super(2, cVar);
        this.f389r = 5;
        this.f391t = dVar;
        this.f390s = i10;
    }
}
