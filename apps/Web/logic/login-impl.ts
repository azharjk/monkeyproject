import { z } from 'zod';
import { Query } from '../utils/query';
import { ApiUrl } from '../meta/api-url';

interface LoginCredentials {
  nim: string;
  pinCode: string;
}

interface AccessRefreshToken {
  accessToken: string;
  refreshToken: string;
}

interface ErrorReason {
  error: string;
  reason: string;
}

const loginCredentialsSchema = z.object({
  nim: z.string().regex(/^\d+$/),
  pinCode: z.string().regex(/^\d+$/),
});

export const LoginImpl = {
  validateCredentials: (credentials: LoginCredentials) => {
    const result = loginCredentialsSchema.safeParse(credentials);
    return result.success;
  },
  login: async (credentials: LoginCredentials) => {
    const res = (await Query.post(ApiUrl.Login, credentials)) as any;
    if (typeof res.error !== 'undefined') {
      alert(
        `Login error ${(res as ErrorReason).error} and ${
          (res as ErrorReason).reason
        }`
      );
      return null;
    }

    return res as AccessRefreshToken;
  },
};
