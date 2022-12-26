interface QueryConfig {
  authorization: string;
}

export const Query = {
  get: async <TData>(url: string, config: QueryConfig) => {
    const res = await fetch(url, {
      headers: {
        Authorization: config.authorization,
      },
    });

    const json = (await res.json()) as unknown;
    return json as TData;
  },
  post: async <TData>(url: string, data: unknown) => {
    const res = await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(data),
    });

    const json = (await res.json()) as unknown;
    return json as TData;
  },
};
