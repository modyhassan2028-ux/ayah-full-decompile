package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Binder implements d {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f11352f;

    public l(m mVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f11352f = new AtomicReference(mVar);
    }

    @Override // android.support.v4.media.session.d
    public final boolean A() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B0(float f3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent C() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean D0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int E() {
        return ((m) this.f11352f.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final void G(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void H() {
    }

    @Override // android.support.v4.media.session.d
    public final void K(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M() {
    }

    @Override // android.support.v4.media.session.d
    public final void Q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void U(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void W(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void X(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Y() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence a0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void d0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long e() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat e0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle g0() {
        ((m) this.f11352f.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void h0(b bVar) {
        m mVar = (m) this.f11352f.get();
        if (mVar == null) {
            return;
        }
        mVar.f11357e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (mVar.f11356d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void i0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int l0() {
        return ((m) this.f11352f.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final void m(b bVar) {
        m mVar = (m) this.f11352f.get();
        if (mVar == null) {
            return;
        }
        mVar.f11357e.register(bVar, new p143o2.n("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (mVar.f11356d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void n(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i10) {
            case 1:
                U(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) p017b7.g.F(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zD0 = D0((KeyEvent) p017b7.g.F(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zD0 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f11336f = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                m(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f11336f = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
                    }
                }
                h0(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zA = A();
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 6:
                String strY0 = y0();
                parcel2.writeNoException();
                parcel2.writeString(strY0);
                return true;
            case 7:
                String strQ = q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 8:
                PendingIntent pendingIntentC = C();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, pendingIntentC, 1);
                return true;
            case 9:
                long jE = e();
                parcel2.writeNoException();
                parcel2.writeLong(jE);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoQ0 = q0();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, parcelableVolumeInfoQ0, 1);
                return true;
            case 11:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                parcel.readString();
                W(i12, i13);
                parcel2.writeNoException();
                return true;
            case 12:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                parcel.readString();
                p0(i14, i15);
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                S();
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                i0(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                o0(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                u0((Uri) p017b7.g.F(parcel, Uri.CREATOR), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                n0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                d0();
                parcel2.writeNoException();
                return true;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                s0();
                parcel2.writeNoException();
                return true;
            case 23:
                Y();
                parcel2.writeNoException();
                return true;
            case 24:
                w0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                s((RatingCompat) p017b7.g.F(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                k(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatE0 = e0();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, mediaMetadataCompatE0, 1);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatW = w();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, playbackStateCompatW, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceA0 = a0();
                parcel2.writeNoException();
                if (charSequenceA0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceA0, parcel2, 1);
                return true;
            case 31:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, extras, 1);
                return true;
            case 32:
                H();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                Q();
                parcel2.writeNoException();
                return true;
            case 34:
                f0(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                K(parcel.readString(), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                v((Uri) p017b7.g.F(parcel, Uri.CREATOR), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iL0 = l0();
                parcel2.writeNoException();
                parcel2.writeInt(iL0);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                X(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                B((MediaDescriptionCompat) p017b7.g.F(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                p((MediaDescriptionCompat) p017b7.g.F(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                z((MediaDescriptionCompat) p017b7.g.F(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                G(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                M();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                r(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iE = E();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 48:
                x0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                B0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleG0 = g0();
                parcel2.writeNoException();
                p017b7.g.C0(parcel2, bundleG0, 1);
                return true;
            case 51:
                n((RatingCompat) p017b7.g.F(parcel, RatingCompat.CREATOR), (Bundle) p017b7.g.F(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void p0(int i10, int i11) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo q0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r(boolean z10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void s0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u0(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat w() {
        long j;
        m mVar = (m) this.f11352f.get();
        if (mVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = mVar.f11358f;
        MediaMetadataCompat mediaMetadataCompat = mVar.g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f3 = playbackStateCompat.f11326u;
        long j10 = playbackStateCompat.f11330y;
        int i10 = playbackStateCompat.f11323r;
        long j11 = playbackStateCompat.f11324s;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i10 != 3 && i10 != 4 && i10 != 5) || j10 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = ((long) (f3 * (jElapsedRealtime - j10))) + j11;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f11291r;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j12 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j12 < 0 || j13 <= j12) {
            j = j13 < 0 ? 0L : j13;
        } else {
            j = j12;
        }
        ArrayList arrayList = new ArrayList();
        long j14 = playbackStateCompat.f11325t;
        long j15 = playbackStateCompat.f11327v;
        int i11 = playbackStateCompat.f11328w;
        CharSequence charSequence = playbackStateCompat.f11329x;
        ArrayList arrayList2 = playbackStateCompat.f11331z;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f11323r, j, j14, playbackStateCompat.f11326u, j15, i11, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f11320A, playbackStateCompat.f11321B);
    }

    @Override // android.support.v4.media.session.d
    public final void w0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x0(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String y0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void V() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
