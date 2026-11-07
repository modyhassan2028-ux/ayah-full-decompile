package O9;

import A.C0039q;
import D0.z;
import F.A;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import Q8.C0468o;
import Q8.K;
import Q8.a0;
import Q8.f0;
import T1.B;
import T1.C0487d;
import T1.C0494k;
import T1.N;
import W.C0604u1;
import Z.C0691k0;
import android.app.Activity;
import androidx.compose.ui.window.PopupLayout;
import com.ayah.MainActivity;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import com.ayah.note.NoteActivity;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.List;
import org.json.JSONObject;
import p207v2.C1381t;
import p207v2.G;
import p207v2.e0;
import p223x.C1411c;
import p223x.InterfaceC1421j;
import p223x.u0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6569u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6566r = i10;
        this.f6568t = obj;
        this.f6569u = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6566r) {
            case 0:
                y yVar = new y((InterfaceC0416i) this.f6569u, cVar, 0);
                yVar.f6568t = obj;
                return yVar;
            case 1:
                return new y((P2.b) this.f6568t, (Activity) this.f6569u, cVar, 1);
            case 2:
                return new y((Q0.d) this.f6568t, (Runnable) this.f6569u, cVar, 2);
            case 3:
                return new y((C0468o) this.f6568t, (a0) this.f6569u, cVar, 3);
            case 4:
                return new y((f0) this.f6568t, (K) this.f6569u, cVar, 4);
            case 5:
                y yVar2 = new y((List) this.f6569u, cVar, 5);
                yVar2.f6568t = obj;
                return yVar2;
            case 6:
                return new y((p241y9.e) this.f6568t, (C0487d) this.f6569u, cVar);
            case 7:
                y yVar3 = new y((B) this.f6569u, cVar, 7);
                yVar3.f6568t = obj;
                return yVar3;
            case 8:
                return new y((Aa.a) this.f6569u, cVar, 8);
            case 9:
                y yVar4 = new y((T8.c) this.f6569u, cVar, 9);
                yVar4.f6568t = obj;
                return yVar4;
            case 10:
                y yVar5 = new y((V.b) this.f6569u, cVar, 10);
                yVar5.f6568t = obj;
                return yVar5;
            case 11:
                return new y((D0.y) this.f6568t, (InterfaceC1421j) this.f6569u, cVar, 11);
            case 12:
                y yVar6 = new y((C0604u1) this.f6569u, cVar, 12);
                yVar6.f6568t = obj;
                return yVar6;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new y((C0604u1) this.f6568t, (C0039q) this.f6569u, cVar, 13);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new y((C1411c) this.f6568t, (u0) this.f6569u, cVar, 14);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new y((InterfaceC0415h) this.f6568t, (C0691k0) this.f6569u, cVar, 15);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new y((Integer) this.f6568t, (A) this.f6569u, cVar, 16);
            case 17:
                return new y((p107k5.e) this.f6568t, (p241y9.a) this.f6569u, cVar, 17);
            case 18:
                return new y((MainActivity) this.f6569u, cVar, 18);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new y((TodayPage) this.f6568t, (p124m3.j) this.f6569u, cVar, 19);
            case 20:
                y yVar7 = new y((M9.s) this.f6569u, cVar, 20);
                yVar7.f6568t = obj;
                return yVar7;
            case 21:
                y yVar8 = new y((EditLibraryComposePage) this.f6569u, cVar, 21);
                yVar8.f6568t = obj;
                return yVar8;
            case 22:
                return new y((EditLibraryComposePage) this.f6568t, (p058f5.d) this.f6569u, cVar, 22);
            case 23:
                return new y((String) this.f6568t, (NoteActivity) this.f6569u, cVar, 23);
            case 24:
                y yVar9 = new y((PopupLayout) this.f6569u, cVar, 24);
                yVar9.f6568t = obj;
                return yVar9;
            case 25:
                return new y((p074h0.i) this.f6568t, (E3.c) this.f6569u, cVar, 25);
            case 26:
                y yVar10 = new y((s3.a) this.f6569u, cVar, 26);
                yVar10.f6568t = obj;
                return yVar10;
            case 27:
                y yVar11 = new y((C1381t) this.f6569u, cVar, 27);
                yVar11.f6568t = obj;
                return yVar11;
            case 28:
                return new y((G) this.f6568t, (e0) this.f6569u, cVar, 28);
            default:
                return new y((G) this.f6568t, (M9.e) this.f6569u, cVar, 29);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6566r) {
            case 0:
                return ((y) create(obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 5:
                return ((y) create((C0494k) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((y) create((N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 8:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 9:
                return ((y) create((JSONObject) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 10:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 11:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 12:
                return ((y) create((z) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 17:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 18:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 20:
                return ((y) create((i6.g) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 21:
                return ((y) create((p058f5.b) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 22:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 23:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 24:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 25:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 26:
                return ((y) create((i6.g) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 27:
                return ((y) create((e0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 28:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((y) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:321:0x0605 A[PHI: r0 r1
      0x0605: PHI (r0v61 O9.y) = (r0v67 O9.y), (r0v74 O9.y) binds: [B:319:0x0602, B:315:0x05cc] A[DONT_GENERATE, DONT_INLINE]
      0x0605: PHI (r1v20 java.lang.Object) = (r1v23 java.lang.Object), (r1v24 java.lang.Object) binds: [B:319:0x0602, B:315:0x05cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:322:0x060d -> B:324:0x0611). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x016e -> B:74:0x0172). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O9.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6566r = i10;
        this.f6569u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(p241y9.e eVar, C0487d c0487d, p150o9.c cVar) {
        super(2, cVar);
        this.f6566r = 6;
        this.f6568t = (q9.i) eVar;
        this.f6569u = c0487d;
    }
}
