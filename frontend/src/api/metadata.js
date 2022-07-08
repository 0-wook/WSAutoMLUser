import axios from "axios";

export function getMetadatas(page, size) {
  return axios.get(`/metadata?page=${page}&size=${size}`)
    .then(response => response.data.data)
}

export async function createMetadata(createMetadataAttributes) {
  return axios.post("/metadata", createMetadataAttributes);
}
