package p175r4;

import F2.x;
import com.ayah.feature.audio.service.AyahAudioService;
import i6.b;
import i6.d;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p246z4.g;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AyahAudioService f21566t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AyahAudioService ayahAudioService, c cVar, int i10) {
        super(2, cVar);
        this.f21564r = i10;
        this.f21566t = ayahAudioService;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f21564r) {
            case 0:
                e eVar = new e(this.f21566t, cVar, 0);
                eVar.f21565s = obj;
                return eVar;
            case 1:
                e eVar2 = new e(this.f21566t, cVar, 1);
                eVar2.f21565s = obj;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f21566t, cVar, 2);
                eVar3.f21565s = obj;
                return eVar3;
            default:
                e eVar4 = new e(this.f21566t, cVar, 3);
                eVar4.f21565s = obj;
                return eVar4;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21564r) {
            case 0:
                e eVar = (e) create((g) obj, (c) obj2);
                y yVar = y.f19095a;
                eVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                e eVar2 = (e) create((i6.g) obj, (c) obj2);
                y yVar2 = y.f19095a;
                eVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                e eVar3 = (e) create((p219w4.e) obj, (c) obj2);
                y yVar3 = y.f19095a;
                eVar3.invokeSuspend(yVar3);
                return yVar3;
            default:
                e eVar4 = (e) create((p219w4.g) obj, (c) obj2);
                y yVar4 = y.f19095a;
                eVar4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21564r;
        y yVar = y.f19095a;
        AyahAudioService ayahAudioService = this.f21566t;
        switch (i10) {
            case 0:
                g gVar = (g) this.f21565s;
                a.e(obj);
                android.support.v4.media.session.i iVar = ayahAudioService.f13736A;
                if (iVar != null) {
                    iVar.post(new x(13, gVar, ayahAudioService));
                    return yVar;
                }
                j.k("serviceHandler");
                throw null;
            case 1:
                i6.g gVar2 = (i6.g) this.f21565s;
                a.e(obj);
                if (gVar2 instanceof b) {
                    android.support.v4.media.session.i iVar2 = ayahAudioService.f13736A;
                    if (iVar2 == null) {
                        j.k("serviceHandler");
                        throw null;
                    }
                    iVar2.sendEmptyMessage(3);
                } else if (gVar2 instanceof d) {
                    android.support.v4.media.session.i iVar3 = ayahAudioService.f13736A;
                    if (iVar3 == null) {
                        j.k("serviceHandler");
                        throw null;
                    }
                    iVar3.sendEmptyMessage(4);
                }
                return yVar;
            case 2:
                p219w4.e eVar = (p219w4.e) this.f21565s;
                a.e(obj);
                android.support.v4.media.session.i iVar4 = ayahAudioService.f13736A;
                if (iVar4 != null) {
                    iVar4.post(new x(14, ayahAudioService, eVar));
                    return yVar;
                }
                j.k("serviceHandler");
                throw null;
            default:
                p219w4.g gVar3 = (p219w4.g) this.f21565s;
                a.e(obj);
                android.support.v4.media.session.i iVar5 = ayahAudioService.f13736A;
                if (iVar5 != null) {
                    iVar5.post(new x(15, ayahAudioService, gVar3));
                    return yVar;
                }
                j.k("serviceHandler");
                throw null;
        }
    }
}
