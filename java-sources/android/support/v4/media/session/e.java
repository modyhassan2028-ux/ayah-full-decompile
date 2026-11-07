package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import io.realm.RealmFieldTypeConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Binder implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f11338f;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f11338f = new WeakReference(null);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i10) {
            case 1:
                parcel.readString();
                if (this.f11338f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                z0((PlaybackStateCompat) p000a.a.c(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                parcel.readInt();
                if (this.f11338f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f11338f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.f11338f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                if (this.f11338f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void z0(PlaybackStateCompat playbackStateCompat) {
        if (this.f11338f.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
